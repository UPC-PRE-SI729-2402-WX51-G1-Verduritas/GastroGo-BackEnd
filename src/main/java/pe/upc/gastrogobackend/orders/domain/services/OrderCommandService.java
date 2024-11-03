package pe.upc.gastrogobackend.orders.domain.services;

import pe.upc.gastrogobackend.orders.domain.model.aggregates.OrderEntity;
import pe.upc.gastrogobackend.orders.domain.model.commands.CreateOrderCommand;

import java.util.Optional;

public interface OrderCommandService {
    Optional<OrderEntity> handle(CreateOrderCommand createOrderCommand);

}
