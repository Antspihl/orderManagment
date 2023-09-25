package com.orderManagment.internship.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "orders")
@Entity
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private long id;
    @Column(name = "customer_registration_code")
    private String customerRegistrationCode;
    @Column(name = "order_date")
    private String orderDate;
}