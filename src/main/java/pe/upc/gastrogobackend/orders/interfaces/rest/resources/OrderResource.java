package pe.upc.gastrogobackend.orders.interfaces.rest.resources;

public record OrderResource(
        String id,
        String customerId,
        String restaurantId,
        String address
) {
}
