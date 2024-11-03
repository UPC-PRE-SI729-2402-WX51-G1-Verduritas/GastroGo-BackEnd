package pe.upc.gastrogobackend.booking.domain.services;

import org.springframework.stereotype.Service;
import pe.upc.gastrogobackend.booking.domain.model.aggregates.Menu;
import pe.upc.gastrogobackend.booking.domain.model.queries.GetAllMenuQuery;
import pe.upc.gastrogobackend.booking.domain.model.queries.GetMenuByIdQuery;

import java.util.List;
import java.util.Optional;

@Service
public interface MenuQueryService {
    Optional<Menu> handle(GetMenuByIdQuery query);
    List<Menu> handle(GetAllMenuQuery query);
}
