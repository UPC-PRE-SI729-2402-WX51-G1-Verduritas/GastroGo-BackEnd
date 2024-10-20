package pe.upc.gastrogobackend.shared.domain.model.valueobjects;

import java.util.Objects;

/**
 * @summary Represents the price of an item in the system, enforcing domain-specific logic.
 */

public class Price {
    private final double value;

    public Price(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Price price = (Price) o;
        return Double.compare(price.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}