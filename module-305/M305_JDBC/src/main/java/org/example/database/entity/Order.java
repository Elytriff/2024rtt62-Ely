package org.example.database.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.type.descriptor.jdbc.LongVarcharJdbcType;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@Entity
@ToString
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customers customer_id;

    @Column(name = "order_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date orderDate;

    @Column(name = "required_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date requiredDate;

    @Column(name = "shipped_date")
    @Temporal(TemporalType.DATE)
    private Date shippedDate;

    @Column(name = "status", nullable = false, length = 15)
    private String status;

    @Column(name = "comments")
    private String comments;

}