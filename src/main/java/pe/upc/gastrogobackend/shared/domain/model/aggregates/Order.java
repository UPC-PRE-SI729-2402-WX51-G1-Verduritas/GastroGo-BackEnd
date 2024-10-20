package pe.upc.gastrogobackend.shared.domain.model.aggregates;

import org.springframework.data.domain.AbstractAggregateRoot;

/**
 * @summary Represents an order placed by a client.
 */
public class Order extends AbstractAggregateRoot<Order> {
    private String orderId;
    private String orderState;
    private String deliveryTime;
    private double total;

    public Order(String orderId, String orderState, String deliveryTime, double total) {
        this.orderId = orderId;
        this.orderState = orderState;
        this.deliveryTime = deliveryTime;
        this.total = total;
    }

    public double calculateTotal() {
        return this.total;
    }

    public void sendNotification() {
    }
}
