package pe.upc.gastrogobackend.shared.domain.model.commands;

/**
 * @summary Command to create a new order in the system.
 */

public record CreateOrderCommand(String orderId, String userId, String menuId, double total) {

}

