package pe.upc.gastrogobackend.booking.interfaces.rest.resources;


public record CreateProductResource(String name, String category, Long stock, Double price) {
}
