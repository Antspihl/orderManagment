package com.orderManagment.dto;

import java.util.List;

public record FullOrder(OrderDto orderDto, List<OrderLineDto> orderLineDtos) {
}
