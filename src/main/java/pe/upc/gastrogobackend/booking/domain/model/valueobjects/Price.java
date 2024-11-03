package pe.upc.gastrogobackend.booking.domain.model.valueobjects;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Getter
@Embeddable
public class Price {

    private double amount;

    public Price(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Price amount cannot be negative.");
        }
        this.amount = amount;
    }
    public Price(){

    }


}

