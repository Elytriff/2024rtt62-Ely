package com.example.springboot.validation;

import com.example.springboot.database.dao.EmployeeDAO;
import com.example.springboot.database.entity.Employee;
import jakarta.validation.Constraint;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

public class EmployeeEmailUnique {

    @Autowired
    private EmployeeDAO employeeDAO;

    public boolean isValid(String value, ConstraintValidatorContext context){
        if(StringUtils.isEmpty(value)){
            return true;
        }
        Employee employee = employeeDAO.findByEmailIgnoreCase(value);
        return(employee == null);
    }
}




