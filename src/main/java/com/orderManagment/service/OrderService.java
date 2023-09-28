package com.orderManagment.service;

import com.orderManagment.dto.OrderDto;
import com.orderManagment.dto.OrderLineDto;
import com.orderManagment.entity.Order;
import com.orderManagment.mapper.OrderMapper;
import com.orderManagment.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;
    private final OrderLineService orderLineService;

    public OrderService(OrderRepository orderRepository, OrderMapper orderMapper, OrderLineService orderLineService) {
        this.orderRepository = orderRepository;
        this.orderMapper = orderMapper;
        this.orderLineService = orderLineService;
    }

    public OrderDto addOrder(OrderDto orderDto, List<OrderLineDto> orderLineDtos) {
        Order order = orderMapper.toEntity(orderDto);
        orderRepository.save(order);
        for (OrderLineDto orderLineDto : orderLineDtos) {
            orderLineService.addOrderLine(orderLineDto, order.getId());
        }
        return orderMapper.toDto(order);
    }

    public List<OrderDto> getOrdersByDate(Date date) {
        List<Order> order = orderRepository.findByOrderDate(date);
        return orderMapper.toDtoList(order);
    }
}
