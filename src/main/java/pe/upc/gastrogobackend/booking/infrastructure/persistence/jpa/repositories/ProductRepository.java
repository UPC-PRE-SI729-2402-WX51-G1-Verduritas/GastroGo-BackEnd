package pe.upc.gastrogobackend.booking.infrastructure.persistence.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.upc.gastrogobackend.booking.domain.model.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


}
