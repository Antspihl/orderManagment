package com.orderManagment.internship.controller;

import com.orderManagment.internship.entity.OrderLine;
import com.orderManagment.internship.service.OrderLineService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ordersLine")
@RequiredArgsConstructor
public class OrderLineController {
    private final OrderLineService orderLineService;
}
