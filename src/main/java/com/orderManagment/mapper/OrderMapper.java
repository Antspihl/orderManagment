package com.orderManagment.mapper;

import com.orderManagment.dto.OrderDto;
import com.orderManagment.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface OrderMapper {
    OrderDto toDto(Order order);
    Order toEntity(OrderDto orderDto);

    List<OrderDto> toDtoList(List<Order> order);
}
