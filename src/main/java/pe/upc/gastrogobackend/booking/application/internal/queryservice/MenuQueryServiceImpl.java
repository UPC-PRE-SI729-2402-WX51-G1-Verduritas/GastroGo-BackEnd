package pe.upc.gastrogobackend.booking.application.internal.queryservice;

import org.springframework.stereotype.Service;
import pe.upc.gastrogobackend.booking.domain.model.aggregates.Menu;
import pe.upc.gastrogobackend.booking.domain.model.queries.GetAllMenuQuery;
import pe.upc.gastrogobackend.booking.domain.model.queries.GetMenuByIdQuery;
import pe.upc.gastrogobackend.booking.domain.services.MenuQueryService;

import java.util.List;
import java.util.Optional;
@Service
public class MenuQueryServiceImpl implements MenuQueryService {
    @Override
    public Optional<Menu> handle(GetMenuByIdQuery query) {
        return Optional.empty();
    }

    @Override
    public List<Menu> handle(GetAllMenuQuery query) {
        return List.of();
    }
}
