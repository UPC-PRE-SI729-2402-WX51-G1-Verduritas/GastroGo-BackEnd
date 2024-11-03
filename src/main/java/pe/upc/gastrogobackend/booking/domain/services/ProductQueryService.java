package pe.upc.gastrogobackend.booking.domain.services;

import pe.upc.gastrogobackend.booking.domain.model.entities.Product;
import pe.upc.gastrogobackend.booking.domain.model.queries.GetProductByIdQuery;
import pe.upc.gastrogobackend.booking.domain.model.queries.GetProductsByMenuIdQuery;

import java.util.List;
import java.util.Optional;

public interface ProductQueryService {
    Optional<Product> handle(GetProductByIdQuery query);
    List<Product> handle (GetProductsByMenuIdQuery query);
}
