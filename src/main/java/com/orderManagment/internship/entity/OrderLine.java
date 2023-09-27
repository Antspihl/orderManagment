package com.orderManagment.internship.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "order_lines")
@Entity
@Data
public class OrderLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "line_id", columnDefinition = "SERIAL")
    private long id;
    @Column(name = "order_id", columnDefinition = "INT")
    private long orderId;
    @Column(name = "product_id", columnDefinition = "STRING(12)")
    private long productId;
    @Column(name = "quantity", columnDefinition = "INT")
    private long quantity;
}