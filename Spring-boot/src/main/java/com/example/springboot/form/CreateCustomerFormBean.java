package com.example.springboot.form;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class CreateCustomerFormBean {

    private int id;

    @NotEmpty(message = "Name is required.")
    private String customerName;

    @NotEmpty(message = "Lastname is required.")
    private String contactLastname;

    @NotEmpty(message = "First name is required.")
    private String contactFirstname;

    @NotEmpty(message = "Phone number is required.")
    private String phone;

    @NotEmpty(message = "Address is required.")
    private String addressLine1;

    private String addressLine2;// nullable

    @NotEmpty(message = "City is required.")
    private String city;

    @NotEmpty(message = "State is required.")
    private String state;

    private String postalCode;// nullable

    @NotEmpty(message = "Country is required.")
    private String country;

    private Integer salesRepEmployeeId;

    private Double creditLimit;// nullable
}
