package com.orderManagment.dto;

import java.sql.Date;

public record OrderDto(long customerRegistrationCode, Date orderDate) {}
