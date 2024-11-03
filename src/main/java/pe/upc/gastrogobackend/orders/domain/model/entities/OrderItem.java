package pe.upc.gastrogobackend.orders.domain.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
public class OrderItem {

    /** The order item id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    /** The product name */
    @Column(nullable = false, length = 100)
    @Getter
    @Setter
    private String productName;

    /** The quantity of the product */
    @Column(nullable = false)
    @Getter
    @Setter
    private int quantity;

    public OrderItem(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }
}