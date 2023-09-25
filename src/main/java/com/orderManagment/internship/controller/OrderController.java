package com.orderManagment.internship.controller;

import com.orderManagment.internship.dto.OrderDto;
import com.orderManagment.internship.dto.OrderLineDto;
import com.orderManagment.internship.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping("/add/")
    public OrderDto addOrder(@RequestBody OrderDto orderDto, @RequestParam List<OrderLineDto> orderLineDtos) {
        return orderService.addOrder(orderDto, orderLineDtos);
    }

    @GetMapping("/date/{date}")
    public List<OrderDto> getOrdersByDate(@PathVariable Date date) {
        return orderService.getOrdersByDate(date);
    }
}
