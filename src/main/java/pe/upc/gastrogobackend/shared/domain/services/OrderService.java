package pe.upc.gastrogobackend.shared.domain.services;

import pe.upc.gastrogobackend.shared.domain.model.aggregates.Order;

/**
 * @summary Service interface for managing orders in the system.
 */

public interface OrderService {

    /**
     * Creates a new order in the system.
     *
     * @param orderId The unique identifier of the order.
     * @param userId The user placing the order.
     * @param menuId The menu item being ordered.
     * @param total The total price of the order.
     */
    void createOrder(String orderId, String userId, String menuId, double total);

    /**
     * Retrieves the details of an order by its ID.
     *
     * @param orderId The unique identifier of the order.
     * @return The details of the order.
     */
    Order getOrder(String orderId);
}