package pe.upc.gastrogobackend.booking.interfaces.rest.transform;

import pe.upc.gastrogobackend.booking.domain.model.entities.Product;
import pe.upc.gastrogobackend.booking.interfaces.rest.resources.ProductResource;

public class ProductResourceFromEntityResourceAssembler {
    public static ProductResource toResourceFromEntity(Product entity) {
        return new ProductResource(entity.getId(), entity.getName(), entity.getCategory().toString(), entity.getStock(), entity.getPrice().getAmount());
    }
}
