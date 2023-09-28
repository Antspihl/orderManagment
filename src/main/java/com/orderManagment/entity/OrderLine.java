package com.orderManagment.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "order_lines")
@Entity
@Data
public class OrderLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "line_id")
    private long id;
    @Column(name = "order_id")
    private long orderId;
    @Column(name = "product_id")
    private long productId;
    @Column(name = "quantity")
    private long quantity;
}