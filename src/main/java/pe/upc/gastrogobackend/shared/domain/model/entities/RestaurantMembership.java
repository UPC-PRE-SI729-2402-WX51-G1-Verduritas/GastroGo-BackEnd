package pe.upc.gastrogobackend.shared.domain.model.entities;
/**
 * @summary RestaurantMembership represents the subscription of a restaurant.
 */
public class RestaurantMembership {
    private String membershipId;
    private String restaurantId;
    private float price;
    private String benefits;

    /**
     * @summary Renews the membership for the restaurant.
     */
    public void renewMembership() {
    }

    /**
     * @summary Cancels the membership for the restaurant.
     */
    public void cancelMembership() {
    }

}
