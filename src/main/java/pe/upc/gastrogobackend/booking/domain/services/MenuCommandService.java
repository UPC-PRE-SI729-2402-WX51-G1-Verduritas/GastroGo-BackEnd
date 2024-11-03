package pe.upc.gastrogobackend.booking.domain.services;

import org.springframework.stereotype.Service;
import pe.upc.gastrogobackend.booking.domain.model.aggregates.Menu;
import pe.upc.gastrogobackend.booking.domain.model.commnads.CreateMenuCommand;

import java.util.Optional;
@Service
public interface MenuCommandService {
    Optional<Menu> handle(CreateMenuCommand command);
}
