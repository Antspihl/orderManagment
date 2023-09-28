package com.orderManagment.controller;

import com.orderManagment.dto.FullOrder;
import com.orderManagment.dto.OrderDto;
import com.orderManagment.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping("")
    public OrderDto addOrder(@RequestBody FullOrder fullOrder) {
        return orderService.addOrder(fullOrder.orderDto(), fullOrder.orderLineDtos());
    }

    @GetMapping("/date/{date}")
    public List<OrderDto> getOrdersByDate(@PathVariable Date date) {
        return orderService.getOrdersByDate(date);
    }
}
