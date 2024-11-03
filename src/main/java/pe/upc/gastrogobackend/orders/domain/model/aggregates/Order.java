
package pe.upc.gastrogobackend.orders.domain.model.aggregates;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.upc.gastrogobackend.orders.domain.model.commands.CreateOrderCommand;
import pe.upc.gastrogobackend.orders.domain.model.entities.OrderItem;
import pe.upc.gastrogobackend.shared.domain.model.aggregates.AuditableAbstractAggregateRoot;

import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
public class Order {

    /** The order id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    /** The restaurant name */
    @Column(nullable = false, length = 100)
    @Getter
    @Setter
    private String restaurantName;

    /** The order date */
    @Column(nullable = false, length = 50)
    @Getter
    @Setter
    private String orderDate;

    /** The order status */
    @Column(nullable = false, length = 50)
    @Getter
    @Setter
    private String status;

    /** The delivery time */
    @Column(nullable = false, length = 50)
    @Getter
    @Setter
    private String deliveryTime;

    /** The list of order items */
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "order_id")
    @Getter
    @Setter
    private List<OrderItem> orderItems;

    /*public Order(String restaurantName, Date orderDate, String status, String deliveryTime, List<OrderItem> orderItems) {
        this.restaurantName = restaurantName;
        this.orderDate = orderDate;
        this.status = status;
        this.deliveryTime = deliveryTime;
        this.orderItems = orderItems;
    }*/
    /// Para cuando tengas tu base de datos

    public Order(CreateOrderCommand command) {
        this.restaurantName = command.restaurantName();
        this.orderDate = command.orderDate();
        this.status = command.status();
        this.deliveryTime = command.deliveryTime();

        this.orderItems = null;
    }

}