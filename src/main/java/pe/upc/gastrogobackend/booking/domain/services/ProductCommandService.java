package pe.upc.gastrogobackend.booking.domain.services;

import pe.upc.gastrogobackend.booking.domain.model.commnads.CreateProductCommand;
import pe.upc.gastrogobackend.booking.domain.model.entities.Product;

import java.util.Optional;

public interface ProductCommandService {
    Optional<Product> handle(CreateProductCommand command);

}
