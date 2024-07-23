package com.example.springboot.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@ToString
@AllArgsConstructor
@NoArgsConstructor

@Getter
@Setter
@Entity
@Table(name = "customers")
public class Customer {

    @Id // telling Hibernate this is a PK (primary key)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

 //---------- mappedBy = "name_of_the_column_in_the_foreign_table", -----------------
    @ToString.Exclude
    @OneToMany(mappedBy = "customer_id", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Order> orders; // <ClassEntity>

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "contact_lastname")
    private String contactLastname;

    @Column(name = "contact_firstname")
    private String contactFirstname;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address_line1")
    private String addressLine1;

    @Column(name = "address_line2")
    private String addressLine2;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "country")
    private String country;

    @Column(name = "sales_rep_employee_id", updatable = false, insertable = false)
    private Integer salesRepEmployeeId;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "sales_rep_employee_id", nullable = true)
    private Employee employee;

    @Column(name = "credit_limit", columnDefinition = "Decimal")
    private Double creditLimit;


}
