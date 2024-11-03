package pe.upc.gastrogobackend.orders.interfaces.rest.transform;

import pe.upc.gastrogobackend.orders.domain.model.commands.CreateOrderCommand;
import pe.upc.gastrogobackend.orders.interfaces.rest.resources.CreateOrderResource;

public class CreateOrderCommandFromResourceAssembler {
    public static CreateOrderCommand toCommand(CreateOrderResource createOrderResource) {
        return new CreateOrderCommand(
                createOrderResource.customerId(),
                createOrderResource.restaurantId(),
                createOrderResource.address(),
                createOrderResource.orderDetails()
        );
    }
}
