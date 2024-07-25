package org.example.database.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

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

    @ToString.Exclude
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

    @Column(name = "buy_price", nullable = false, columnDefinition = "Decimal")
    private Double buyPrice;

    @Column(name = "msrp", nullable = false, columnDefinition = "DECIMAL")
    private Double msrp;

    @ToString.Exclude
    @OneToMany(mappedBy = "product")
    private List<Orderdetail> orderdetails;

}