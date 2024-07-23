package com.example.springboot.controller;

import com.example.springboot.database.dao.CustomerDAO;
import com.example.springboot.database.dao.EmployeeDAO;
import com.example.springboot.database.entity.Customer;
import com.example.springboot.database.entity.Employee;
import com.example.springboot.database.entity.Office;
import com.example.springboot.form.CreateCustomerFormBean;
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
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerDAO customerDAO;
    @Autowired
    private EmployeeDAO employeeDAO;


    @GetMapping("/customer")
    public ModelAndView customer(@RequestParam(required = false) String customer) {// this parameter will appear in my jsp in the input("name", "id", "label")
        ModelAndView response = new ModelAndView("customer/customer");// jsp file name

//        List<Customer> employeesList = customerDAO.;
//        response.addObject();

        return response;
    }

    @GetMapping("/createCustomer")
    public ModelAndView create() {// this parameter will appear in my jsp in the input("name", "id", "label")
        ModelAndView response = new ModelAndView("customer/createCustomer");// jsp file name

        List<Employee> salesRepEmployeeList = employeeDAO.findAll();
        response.addObject("salesRepresentatives", salesRepEmployeeList);


        return response;
    }



    @GetMapping("/submitCustomer")
    public ModelAndView createSubmit(@Valid CreateCustomerFormBean form, BindingResult bindingResult) {// this parameter will appear in my jsp in the input("name", "id", "label")
        // argument to the constructor here is the view name - the view name can be a JSP location or a redirect URL
        ModelAndView response = new ModelAndView("customer/createCustomer");// jsp file name

        if (bindingResult.hasErrors()) {
            for (ObjectError error : bindingResult.getAllErrors()) {
                log.debug("Validation error : " + ((FieldError) error).getField() + " = " + error.getDefaultMessage());
            }
            // we are in this part of the if statement so we know for sure that an error has occured
            // we are going to add the binding result to the model, so we can use it on the JSP page to show the user the errors
            response.addObject("bindingResult", bindingResult);

            // because the page needs the list of employees for the drop down we need to add the list of employees to the model
            List<Employee> salesRepEmployeeList = employeeDAO.findAll();
            response.addObject("salesRepresentatives", salesRepEmployeeList);


            // this is returning / staying in the same page if errors occur
            response.setViewName("customer/createCustomer");

            // im going to add the form to the model so that we can display the user entered data in the form
            response.addObject("form", form);

            return response;

        } else {
            // log out the incoming variables that are in the CreateEmployeeFormBean
            // variable name
            log.debug(form.toString());

            Customer customer = customerDAO.findById(form.getId());
            if (customer == null) {
                customer = new Customer();
            }

            // setting the incoming user input onto a new Customer object to be saved to the database

            customer.setCustomerName(form.getCustomerName());
            customer.setContactLastname(form.getContactLastname());
            customer.setContactFirstname(form.getContactFirstname());
            customer.setState(form.getState());
            customer.setCity(form.getCity());
            customer.setCountry(form.getCountry());
            customer.setAddressLine1(form.getAddressLine1());
            customer.setAddressLine2(form.getAddressLine2());
            customer.setPostalCode(form.getPostalCode());
            customer.setPhone(form.getPhone());

            Employee employee = employeeDAO.findById(form.getSalesRepEmployeeId());
            customer.setEmployee(employee);

            customer = customerDAO.save(customer);

            response.setViewName("redirect:/customer/customerDetails?customerId=" + customer.getId());
            return response;
        }

    }

    @GetMapping("/edit")
    //by setting (required = false) we allow null to enter the controller so that spring dos not cause an error
    public ModelAndView edit(@RequestParam (required = false) Integer customerId) {
        ModelAndView response = new ModelAndView("customer/createCustomer");

        List<Employee> salesRepEmployeeList = employeeDAO.findAll();
        response.addObject("salesRepresentatives", salesRepEmployeeList);


        CreateCustomerFormBean form = new CreateCustomerFormBean();

        if(customerId != null) {
            Customer customer = customerDAO.findById(customerId);

            if (customer != null) {
                form.setId(customer.getId());
                form.setCustomerName(customer.getCustomerName());
                form.setContactLastname(customer.getContactLastname());
                form.setContactFirstname(customer.getContactFirstname());
                form.setState(customer.getState());
                form.setCity(customer.getCity());
                form.setCountry(customer.getCountry());
                form.setAddressLine1(customer.getAddressLine1());
                form.setAddressLine2(customer.getAddressLine2());
                form.setPostalCode(customer.getPostalCode());
                form.setPhone(customer.getPhone());

                if(customer.getEmployee() == null){customer.setEmployee(new Employee());}

                form.setSalesRepEmployeeId(customer.getEmployee().getId());

                response.addObject("form", form);
            }
        }
        return response;
    }


 //Este es solo el mapping de la pagina customer Details
    @GetMapping("/customerDetails")
    public ModelAndView customerDetails(@RequestParam Integer customerId) {
        ModelAndView response = new ModelAndView("customer/customerDetails");

        Customer customer = customerDAO.findById(customerId);
        response.addObject("customer", customer);

        return response;
    }
}
