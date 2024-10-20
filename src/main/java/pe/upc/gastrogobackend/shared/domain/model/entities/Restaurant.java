package pe.upc.gastrogobackend.shared.domain.model.entities;

/**
 * @summary Represents a restaurant in the system.
 */
public class Restaurant {
    private String restaurantId;
    private String restaurantName;
    private String phone;
    private String email;
    private String password;

    public Restaurant(String restaurantId, String restaurantName, String phone, String email, String password) {
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }

    public void modifyData() {
    }
}
