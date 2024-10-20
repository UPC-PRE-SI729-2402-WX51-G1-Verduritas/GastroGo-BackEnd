package pe.upc.gastrogobackend.shared.domain.model.aggregates;

/**
 * @summary Represents the membership of a restaurant in the system.
 */

public class RestaurantMembership {
    private String membershipId;
    private String restaurantId;
    private double price;
    private String benefits;

    public RestaurantMembership(String membershipId, String restaurantId, double price, String benefits) {
        this.membershipId = membershipId;
        this.restaurantId = restaurantId;
        this.price = price;
        this.benefits = benefits;
    }

    public void renewMembership() {
    }

    public void cancelMembership() {
    }
}