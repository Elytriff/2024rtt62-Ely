package com.example.springboot.database.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Getter
@Setter
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employees")
public class Employee {
    @Id // telling Hibernate this is a PK (primary key)
    @GeneratedValue(strategy = GenerationType.IDENTITY) //this is indicating to Hibernate that this is an autoincremented pk
    @Column(name = "id")
    private Integer id;


    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "extension")
    private String extension;

    @Column(name = "email")
    private String email;

    @Column(name = "reports_to")
    private Integer reportsTo;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "vacation_hours")
    private Integer vacationHours;

    @Column(name = "profile_image_url")
    private String profileImageUrl;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY, optional =true)
    @JoinColumn(name = "office_id", nullable = true)
    private Office office;

    @Column(name = "office_id",insertable = false, updatable = false)// you can not set this object because it is "read only", you have to use the one in the mapping before
    private Integer officeId;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Customer> customers;

}
