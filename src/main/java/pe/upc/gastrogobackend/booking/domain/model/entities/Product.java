package pe.upc.gastrogobackend.booking.domain.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pe.upc.gastrogobackend.booking.domain.model.aggregates.Menu;
import pe.upc.gastrogobackend.booking.domain.model.valueobjects.Category;
import pe.upc.gastrogobackend.booking.domain.model.valueobjects.Price;
import pe.upc.gastrogobackend.shared.domain.model.entities.AuditableModel;


@Getter
@Setter
@Entity
public class Product extends AuditableModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Category category;
    private Long stock;
    private Price price;

    @ManyToOne
    @JoinColumn(name = "menu_id", nullable = false)
    private Menu menu;


    public Product(String name, Category category, Long stock) {
        this.name = name;
        this.category = category;
        this.stock = stock;
    }

    public void SetPrice(Price price) {

        this.price = price;
    }


    public Product() {

    }
}
