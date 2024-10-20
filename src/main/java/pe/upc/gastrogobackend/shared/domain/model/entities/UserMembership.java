package pe.upc.gastrogobackend.shared.domain.model.entities;

/**
 * @summary UserMembership links a user to a membership.
 */

public class UserMembership {
    private String membershipId;
    private String userId;
    private float price;
    private String benefits;

    /**
     * @summary Renews the membership for the user.
     */
    public void renewMembership() {
    }

    /**
     * @summary Cancels the membership for the user.
     */
    public void cancelMembership() {
    }

}