package pe.upc.gastrogobackend.orders.domain.model.commands;

import java.util.Date;

public record CreateOrderCommand(String restaurantName,
                                 String orderDate,
                                 String status,
                                 String deliveryTime)
{}
