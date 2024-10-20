package pe.upc.gastrogobackend.shared.domain.model.queries;

/**
 * @summary Query to retrieve the details of an order.
 */
public record GetOrderQuery(Long id) {
    public GetOrderQuery {
        if (id == null) {
            throw new IllegalArgumentException("id is required");
        }
        if (id <= 0) {
            throw new IllegalArgumentException("id must be greater than 0");
        }
    }
}
