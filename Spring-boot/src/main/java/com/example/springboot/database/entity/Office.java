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
@Table(name = "offices")
public class Office {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "city", nullable = false, length = 50)
    private String city;

    @Column(name = "phone", nullable = false, length = 50)
    private String phone;

    @Column(name = "address_line1", nullable = false, length = 50)
    private String addressLine1;

    @Column(name = "address_line2", length = 50)
    private String addressLine2;

    @Column(name = "state", length = 50)
    private String state;

    @Column(name = "country", nullable = false, length = 50)
    private String country;

    @Column(name = "postal_code", nullable = false, length = 15)
    private String postalCode;

    @Column(name = "territory", nullable = false, length = 10)
    private String territory;

    @OneToMany(mappedBy = "office", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Employee> employees;

}