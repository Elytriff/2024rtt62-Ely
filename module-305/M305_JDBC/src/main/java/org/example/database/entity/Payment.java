package org.example.database.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name = "check_number", nullable = false, length = 50)
    private String checkNumber;

    @Column(name = "payment_date", nullable = false)
    private Date paymentDate;

    @Column(name = "amount", nullable = false, precision = 10, columnDefinition = "BigDecimal")
    private Double amount;

    //TODO [Reverse Engineering] generate columns from DB
}