package pe.upc.gastrogobackend.booking.interfaces.rest.resources;

public record ProductResource(Long id, String name, String category, Long stock, Double price) {
}
