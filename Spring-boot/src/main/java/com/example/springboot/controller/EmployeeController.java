package com.example.springboot.controller;

import com.example.springboot.database.dao.CustomerDAO;
import com.example.springboot.database.dao.EmployeeDAO;
import com.example.springboot.database.dao.OfficeDAO;
import com.example.springboot.database.entity.Customer;
import com.example.springboot.database.entity.Employee;
import com.example.springboot.database.entity.Office;
import com.example.springboot.form.CreateEmployeeFormBean;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/employee")
// this is mapping the directory, so my urls inside this page will have this "/employee" in front of by default although is hidden
public class EmployeeController {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Autowired
    private CustomerDAO customerDAO;

    @Autowired
    private OfficeDAO officeDAO;


    @GetMapping("/employee")// url direction not the same as file direction
    public ModelAndView employee(@RequestParam(required = false) String employeeLastname) {// this parameter will appear in my jsp in the input("name", "id", "label")
        ModelAndView response = new ModelAndView("employee/employee");// jsp file name, in this case also specifying the directory

        List<Employee> employeesList = employeeDAO.findByLastname(employeeLastname);// this is the parameter capture in the input when the users write, and it is the same inside @RequestParam
        response.addObject("employeesToken", employeesList);// this os the one giving me the lists of attributes of an employee and the token is the one that will appear in the ${} in the for loop in the jsp and also will be the object you use to pull the attributes.

        response.addObject("lastnameInput", employeeLastname);// this will capture the user's input and stick it in the input window when the user writes
        //you need to remember to put the @TagLib annotation in the jsp

        return response;
    }

    @GetMapping("/create")
    public ModelAndView create() {// this parameter will appear in my jsp in the input("name", "id", "label")
        ModelAndView response = new ModelAndView("employee/create");// jsp file name

        loadDropdowns(response);

        List<String> employeeJobList = employeeDAO.employeeJobTitleList();
        response.addObject("employeeJobs", employeeJobList);

        return response;
    }

    private void loadDropdowns(ModelAndView response){
        List<Employee> reportsToEmployees = employeeDAO.findAll();
        response.addObject("reportsToEmployees", reportsToEmployees);

        List<Office> officeList = officeDAO.findAll();//query unique offices? and put it in the parameters, change employeeDAO as soon as create officeDAO
        response.addObject("officeAll", officeList);
    }

    @GetMapping("/createSubmit")
    public ModelAndView createSubmit(@Valid CreateEmployeeFormBean form, BindingResult bindingResult) {// this parameter will appear in my jsp in the input("name", "id", "label")
        // argument to the constructor here is the view name - the view name can be a JSP location or a redirect URL
        ModelAndView response = new ModelAndView("employee/create");// jsp file

        if(form.getEmployeeId()== null){
            Employee e = employeeDAO.findByEmailContainingIgnoreCase(form.getEmail());
            if(e!= null){
                bindingResult.rejectValue("email", "email", "This email is already in use. Manual Check");
            }
        }

        if (bindingResult.hasErrors()) {
            for (ObjectError error : bindingResult.getAllErrors()) {
                log.debug("Validation error : " + ((FieldError) error).getField() + " = " + error.getDefaultMessage());
            }
            // we are in this part of the if statement so we know for sure that an error has occured
            // we are going to add the binding result to the model, so we can use it on the JSP page to show the user the errors
            response.addObject("bindingResult", bindingResult);

            // because the page needs the list of employees for the drop down we need to add the list of employees to the model
            loadDropdowns(response);

            // im going to set the view name to be
            response.setViewName("employee/create");

            // im going to add the form to the model so that we can display the user entered data in the form
            response.addObject("form", form);

            return response;

        } else {
            // log out the incoming variables that are in the CreateEmployeeFormBean
            // variable name
            log.debug(form.toString());

            Employee employee=employeeDAO.findById(form.getEmployeeId());
            if (employee == null) {
                employee = new Employee();
            }

            // setting the incoming user input onto a new Employee object to be saved to the database
            employee.setEmail(form.getEmail());
            employee.setFirstname(form.getFirstName());
            employee.setLastname(form.getLastName());
            employee.setReportsTo(form.getReportsTo());
            employee.setExtension(form.getExtension());

            Office office = officeDAO.findById(form.getOfficeId());
            employee.setOffice(office);
            employee.setJobTitle(form.getJobTitle());

            // when we save to the database it will auto increment to give us a new id
            // the new ID is available in the return from the save method.
            // basically returns the same object .. after its been inserted into the database
            employee = employeeDAO.save(employee);

            // redirecting to the employee detail page
            // however often times this would redirect to the edit page (which we have not created)
            // after the redirect is actually a URL not a view name
            // in some ways this is overriding the behavior of the setViewName to use a URL rather than a JSP file location

            response.setViewName("redirect:/employee/detail?employeeId=" + employee.getId());
            return response;
        }
    }

    @GetMapping("/detail")
    public ModelAndView detail(@RequestParam Integer employeeId) {
        ModelAndView response = new ModelAndView("employee/detail");


        List<Customer> customers = customerDAO.findBySalesRepEmployeeId(employeeId);
        response.addObject("customers", customers);


        Employee employee = employeeDAO.findById(employeeId);
        response.addObject("employee", employee);

        return response;
    }

    @GetMapping("/edit")
    //by setting (required = false) we allow null to enter the controller so that spring dos not cause an error
    public ModelAndView edit(@RequestParam (required = false) Integer employeeId) {
        ModelAndView response = new ModelAndView("employee/create");

        loadDropdowns(response);

        CreateEmployeeFormBean form = new CreateEmployeeFormBean();

        if(employeeId != null) {
            Employee employee = employeeDAO.findById(employeeId);

            if (employee != null) {
                form.setEmployeeId(employee.getId());
                form.setEmail(employee.getEmail());
                form.setFirstName(employee.getFirstname());
                form.setLastName(employee.getLastname());
                form.setReportsTo(employee.getReportsTo());
                form.setExtension(employee.getExtension());
                form.setOfficeId(employee.getOffice().getId());
                form.setJobTitle(employee.getJobTitle());

                response.addObject("form", form);
            }
        }
        return response;
    }

}
