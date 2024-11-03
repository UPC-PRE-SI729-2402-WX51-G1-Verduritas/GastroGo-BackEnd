package pe.upc.gastrogobackend.booking.interfaces.rest.resources;

import java.util.List;

public record MenuResource(Long id, String name, List<ProductResource> products) {
}
