package com.orderManagment.internship.service;

import com.orderManagment.internship.dto.OrderDto;
import com.orderManagment.internship.dto.OrderLineDto;
import com.orderManagment.internship.entity.Order;
import com.orderManagment.internship.mapper.OrderMapper;
import com.orderManagment.internship.repository.OrderRepository;
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
        Order order = new Order();
        order.setOrderDate(orderDto.orderDate());
        order.setCustomerRegistrationCode(orderDto.customerRegistrationCode());
        orderRepository.save(order);
        for (OrderLineDto orderLineDto : orderLineDtos) {
            OrderLineDto orderLineDto1 = new OrderLineDto(order.getId(), orderLineDto.productId(), orderLineDto.quantity());
            orderLineService.addOrderLine(orderLineDto1);
        }
        return orderMapper.toDto(order);
    }

    public List<OrderDto> getOrdersByDate(Date date) {
        List<Order> order = orderRepository.findByOrderDate(date);
        return orderMapper.toDtoList(order);
    }
}
