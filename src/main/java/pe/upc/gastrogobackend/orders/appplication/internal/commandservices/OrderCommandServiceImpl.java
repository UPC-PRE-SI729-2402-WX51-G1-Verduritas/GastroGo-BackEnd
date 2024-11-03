package pe.upc.gastrogobackend.orders.appplication.internal.commandservices;

import org.springframework.stereotype.Service;
import pe.upc.gastrogobackend.orders.domain.model.aggregates.Order;
import pe.upc.gastrogobackend.orders.domain.model.commands.CreateOrderCommand;
import pe.upc.gastrogobackend.orders.domain.services.OrderCommandService;
import pe.upc.gastrogobackend.orders.infrastructure.persistence.jpa.repositories.OrderRepository;

import java.util.Optional;

//IMPORTANTE!!!
@Service
public class OrderCommandServiceImpl implements OrderCommandService {

    private final OrderRepository orderRepository;

    public OrderCommandServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Optional<Order> handle(CreateOrderCommand createOrderCommand) {
        var order = new Order(createOrderCommand);
        try {
            orderRepository.save(order);
            return Optional.of(order);
        } catch (Exception e) {
            throw new IllegalArgumentException("Error saving order", e);
        }
    }
}
