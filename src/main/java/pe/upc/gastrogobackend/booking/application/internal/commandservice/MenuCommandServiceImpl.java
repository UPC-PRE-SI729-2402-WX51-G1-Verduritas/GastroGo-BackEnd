package pe.upc.gastrogobackend.booking.application.internal.commandservice;

import pe.upc.gastrogobackend.booking.domain.model.aggregates.Menu;
import pe.upc.gastrogobackend.booking.domain.model.commnads.CreateMenuCommand;
import pe.upc.gastrogobackend.booking.domain.services.MenuCommandService;

import java.util.Optional;

public class MenuCommandServiceImpl implements MenuCommandService {
    @Override
    public Optional<Menu> handle(CreateMenuCommand command) {
        return Optional.empty();
    }
}
