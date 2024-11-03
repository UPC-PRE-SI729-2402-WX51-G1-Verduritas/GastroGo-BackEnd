package pe.upc.gastrogobackend.booking.application.internal.commandservice;

import org.springframework.stereotype.Service;
import pe.upc.gastrogobackend.booking.domain.model.aggregates.Menu;
import pe.upc.gastrogobackend.booking.domain.model.commnads.CreateMenuCommand;
import pe.upc.gastrogobackend.booking.domain.services.MenuCommandService;

import java.util.Optional;
@Service
public class MenuCommandServiceImpl implements MenuCommandService {
    @Override
    public Optional<Menu> handle(CreateMenuCommand command) {
        return Optional.empty();
    }
}
