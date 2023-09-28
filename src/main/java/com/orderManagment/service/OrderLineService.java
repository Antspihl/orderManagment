package com.orderManagment.service;

import com.orderManagment.dto.OrderLineDto;
import com.orderManagment.entity.OrderLine;
import com.orderManagment.repository.OrderLineRepository;
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

    public OrderLine addOrderLine(OrderLineDto orderLineDto, long orderId) {
        OrderLine orderLine = new OrderLine();
        orderLine.setOrderId(orderId);
        orderLine.setProductId(orderLineDto.productId());
        orderLine.setQuantity(orderLineDto.quantity());
        return orderlineRepository.save(orderLine);
    }
}
