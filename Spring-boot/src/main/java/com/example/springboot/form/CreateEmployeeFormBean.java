package com.example.springboot.form;

import com.example.springboot.validation.EmployeeEmailUnique;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

@ToString
@Getter
@Setter
public class CreateEmployeeFormBean {

    private Integer employeeId;

    // these annotation are called JSR-303 validation
    @Length(max= 100, message = "Email must be less than 100 characters")
    @NotEmpty(message = "Email is required.")
    @Email(message = "Please enter a valid email")
    //@EmployeeEmailUnique(message = "This email is already in use.")
    private String email;

    @Length(max = 50, message = "Firstname must be less than 50 characters")
    @NotEmpty(message = "First Name is required.")
    private String firstName;

    @Length(max = 50, message = "Lastname must be less than 50 characters")
    @NotEmpty(message = "Last Name is required.")
    private String lastName;

    private Integer reportsTo;
    private Integer officeId;
    private String extension;
    private String jobTitle;
}
