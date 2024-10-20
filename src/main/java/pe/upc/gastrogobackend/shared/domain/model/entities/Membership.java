package pe.upc.gastrogobackend.shared.domain.model.entities;

/**
 * @summary Represents a membership plan.
 */
public class Membership {
    private String membershipId;
    private String membershipName;
    private String startDate;
    private String finishDate;

    public Membership(String membershipId, String membershipName, String startDate, String finishDate) {
        this.membershipId = membershipId;
        this.membershipName = membershipName;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    public void createMembership() {
    }

    public void paymentInfo() {
    }
}