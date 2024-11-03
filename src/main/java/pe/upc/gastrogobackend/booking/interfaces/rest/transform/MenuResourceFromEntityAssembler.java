package pe.upc.gastrogobackend.booking.interfaces.rest.transform;

import pe.upc.gastrogobackend.booking.domain.model.aggregates.Menu;
import pe.upc.gastrogobackend.booking.interfaces.rest.resources.MenuResource;

import java.util.stream.Collectors;

public class MenuResourceFromEntityAssembler {
    public static MenuResource toResourceFromEntity(Menu entity) {
        return new MenuResource(entity.getId(), entity.getName(), entity.getProducts().stream().map(ProductResourceFromEntityResourceAssembler::toResourceFromEntity).collect(Collectors.toList()));
    }
}
