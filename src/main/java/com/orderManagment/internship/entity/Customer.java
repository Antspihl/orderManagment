package com.orderManagment.internship.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "customers")
@Entity
@Data
public class Customer {
    @Id
    @Column(name = "registration_code")
    private long registrationCode;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "email")
    private String email;
    @Column(name = "telephone")
    private String telephone;

}