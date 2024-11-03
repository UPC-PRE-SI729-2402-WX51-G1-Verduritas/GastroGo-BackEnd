package pe.upc.gastrogobackend.orders.domain.services;

import pe.upc.gastrogobackend.orders.domain.model.aggregates.Order;
import pe.upc.gastrogobackend.orders.domain.model.queries.GetAllOrdersQuery;

import java.util.List;
import java.util.Optional;

public interface OrderQueryService {
    Optional<List<Order>> handle(GetAllOrdersQuery getAllOrders);
}
