package org.example.database.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@ToString
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "product_code", nullable = false, length = 15)
    private String productCode;

    @Column(name = "product_name", nullable = false, length = 70)
    private String productName;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "productline_id", nullable = false)
    private Productline productline;

    @Column(name = "product_scale", nullable = false, length = 10)
    private String productScale;

    @Column(name = "product_vendor", nullable = false, length = 50)
    private String productVendor;

    @Column(name = "product_description", nullable = false)
    private String productDescription;

    @Column(name = "quantity_in_stock", columnDefinition = "smallint")
    private Integer quantityInStock;

    @Column(name = "buy_price", nullable = false, precision = 10, scale = 2)
    private BigDecimal buyPrice;

    @Column(name = "msrp", nullable = false, precision = 10, scale = 2)
    private BigDecimal msrp;

    @OneToMany(mappedBy = "product")
    private Set<Orderdetail> orderdetails = new LinkedHashSet<>();

}