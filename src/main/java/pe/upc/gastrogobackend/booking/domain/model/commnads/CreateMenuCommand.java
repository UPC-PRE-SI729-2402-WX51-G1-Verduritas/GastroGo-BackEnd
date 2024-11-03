package pe.upc.gastrogobackend.booking.domain.model.commnads;

import java.util.List;

public record CreateMenuCommand(String name, List<pe.upc.gastrogobackend.booking.interfaces.rest.resources.CreateProductResource> products) {

}
