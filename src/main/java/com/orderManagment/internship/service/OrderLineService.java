package com.orderManagment.internship.service;

import com.orderManagment.internship.dto.OrderLineDto;
import com.orderManagment.internship.entity.OrderLine;
import com.orderManagment.internship.repository.OrderLineRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderLineService {
    private final OrderLineRepository orderlineRepository;

    public OrderLineService(OrderLineRepository orderlineRepository) {
        this.orderlineRepository = orderlineRepository;
    }

    public List<OrderLine> getAll() {
        return orderlineRepository.findAll();
    }

    public OrderLine addOrderLine(OrderLineDto orderLineDto) {
        OrderLine orderLine = new OrderLine();
        orderLine.setOrderId(orderLineDto.orderId());
        orderLine.setProductId(orderLineDto.productId());
        orderLine.setQuantity(orderLineDto.quantity());
        return orderlineRepository.save(orderLine);
    }
}
