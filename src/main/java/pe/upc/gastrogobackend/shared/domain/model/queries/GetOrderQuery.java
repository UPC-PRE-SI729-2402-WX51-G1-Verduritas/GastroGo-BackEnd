package pe.upc.gastrogobackend.shared.domain.model.queries;

/**
 * Query to retrieve an Order by its ID.
 * Using a record simplifies immutable data storage.
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
