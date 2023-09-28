package com.orderManagment.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Table(name = "orders")
@Entity
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private long id;
    @Column(name = "customer_registration_code")
    private long customerRegistrationCode;
    @Column(name = "order_date")
    private Date orderDate;
}