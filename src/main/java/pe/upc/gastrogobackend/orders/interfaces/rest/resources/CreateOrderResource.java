package pe.upc.gastrogobackend.orders.interfaces.rest.resources;

public record CreateOrderResource(
        String customerId,
        String restaurantId,
        String address,
        String orderDetails
) {
}
