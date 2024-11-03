package pe.upc.gastrogobackend.booking.interfaces.rest.resources;

import java.util.List;

public record CreateMenuResource(String name, List<CreateProductResource> products) {
}
