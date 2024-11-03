package pe.upc.gastrogobackend.booking.domain.model.aggregates;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import pe.upc.gastrogobackend.booking.domain.model.entities.Product;
import pe.upc.gastrogobackend.booking.domain.model.valueobjects.Category;
import pe.upc.gastrogobackend.shared.domain.model.aggregates.AuditableAbstractAggregateRoot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Menu extends AuditableAbstractAggregateRoot<Menu> {
    @Id
    public Long id;
    public String name;
    public Category status;

    @OneToMany(mappedBy = "menu", cascade = CascadeType.ALL, orphanRemoval = true)
    public final List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }

    public void addProduct(Product product) {
        products.add(product);
    }
    public Menu(String name){
        this.name = name;
    }
    public void Appetizer(){
        this.status= Category.Appetizer;
    }
    public void MainDish(){
        this.status= Category.MainDish;
    }
    public void Drink(){
        this.status= Category.Drink;
    }

}

