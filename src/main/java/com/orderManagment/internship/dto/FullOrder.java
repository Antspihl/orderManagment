package com.orderManagment.internship.dto;

import java.util.List;

public record FullOrder(OrderDto orderDto, List<OrderLineDto> orderLineDtos) {
}
