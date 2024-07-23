package com.example.springboot.database.dao;

import com.example.springboot.database.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeDAO extends JpaRepository<Employee, Long> {

    @Query("SELECT e FROM Employee e where e.lastname like concat('%', :lastname, '%')")
    List<Employee> findByLastname(String lastname);

    Employee findById(Integer id);

    @Query("SELECT DISTINCT e.jobTitle FROM Employee e")
    List<String> employeeJobTitleList();

    Employee findByEmailContainingIgnoreCase(String email);

}
