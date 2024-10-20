package pe.upc.gastrogobackend.shared.domain.model.entities;

import java.util.Date;

/**
 * @summary Bill represents the invoice for orders or memberships.
 */
public class Bill {
    private String billId;
    private Date emissionDate;
    private String billState;

    /**
     * @summary Operation for managing bill details.
     */
    public void operation() {
    }

}
