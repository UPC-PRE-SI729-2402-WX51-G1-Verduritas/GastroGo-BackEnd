package pe.upc.gastrogobackend.shared.domain.model.queries;

/**
 * Query to retrieve a Delivery by its ID.
 */
public record GetDeliveryQuery(Long id) {

    public GetDeliveryQuery {
        if (id == null) {
            throw new IllegalArgumentException("id is required");
        }
        if (id <= 0) {
            throw new IllegalArgumentException("id must be greater than 0");
        }
    }
}
