package pe.upc.gastrogobackend.shared.domain.model.aggregates;

/**
 * @summary Represents the association of a user with a membership.
 */

public class UserMembership {
    private String membershipId;
    private String userId;
    private double price;
    private String benefits;

    public UserMembership(String membershipId, String userId, double price, String benefits) {
        this.membershipId = membershipId;
        this.userId = userId;
        this.price = price;
        this.benefits = benefits;
    }

    public void renewMembership() {
    }

    public void cancelMembership() {
    }
}