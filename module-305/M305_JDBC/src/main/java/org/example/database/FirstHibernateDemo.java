package org.example.database;

import org.example.database.dao.EmployeeDAO;
import org.example.database.entity.Employee;

import java.util.List;

public class FirstHibernateDemo {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();

//        //List<Employee> employees = employeeDAO.findByFirstName("Leslie");
//        List<Employee> employees = employeeDAO.findByLastName("Doe");
//
//        for (Employee employee : employees) {
//            System.out.println(employee.getId() + " | " + employee.getFirstname() + " " + employee.getLastname() + " | "
//                    + employee.getEmail() + " | " + employee.getJobTitle());
//            System.out.println(employees);
//        }

        // ------Creating a new employee in the database
//        Employee newEmployee = new Employee();
//
//        newEmployee.setFirstname("First NAME!!!");
//        newEmployee.setLastname("Lastname");
//        newEmployee.setEmail("rtt6211@perschols.org");
//        newEmployee.setOfficeId(3);
//        newEmployee.setExtension("X12345");
//        newEmployee.setJobTitle("Newbie");
//        //newEmployee.setVacationHours(0);
//
//        employeeDAO.insert(newEmployee);
//
//        List<Employee> employees = employeeDAO.findByFirstName("First NAME!!!");
//        //List<Employee> employees = employeeDAO.findByLastName("Doe");
//
//        for (Employee employee : employees) {
//            System.out.println(employee);
//
//
//        }
//
       // Employee employee = employeeDAO.findById(1056);
        //System.out.println(employee);

        Employee employee = employeeDAO.findEmployeeById(1);
        System.out.println(employee);
    }
}
