package com.orderManagment.internship.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "products")
@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private long id;
    @Column(name = "sku_code")
    private String skuCode;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "unit_price")
    private double unitPrice;
}