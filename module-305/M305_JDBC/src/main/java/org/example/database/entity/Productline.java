package org.example.database.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "productlines")
public class Productline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "product_line", nullable = false, length = 50)
    private String productLine;

    @Column(name = "description", length = 4000)
    private String description;

}