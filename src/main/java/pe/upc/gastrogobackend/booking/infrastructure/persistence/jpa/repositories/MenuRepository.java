package pe.upc.gastrogobackend.booking.infrastructure.persistence.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.upc.gastrogobackend.booking.domain.model.aggregates.Menu;


import java.util.Optional;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {

    Optional<Menu> findByName(String name);



}
