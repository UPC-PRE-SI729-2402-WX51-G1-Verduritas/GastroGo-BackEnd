package pe.upc.gastrogobackend.booking.interfaces.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.upc.gastrogobackend.booking.domain.model.queries.GetAllMenuQuery;
import pe.upc.gastrogobackend.booking.domain.model.queries.GetMenuByIdQuery;
import pe.upc.gastrogobackend.booking.domain.services.MenuCommandService;
import pe.upc.gastrogobackend.booking.domain.services.MenuQueryService;
import pe.upc.gastrogobackend.booking.interfaces.rest.resources.CreateMenuResource;
import pe.upc.gastrogobackend.booking.interfaces.rest.resources.MenuResource;
import pe.upc.gastrogobackend.booking.interfaces.rest.transform.CreateMenuCommandFromResourceAssembler;
import pe.upc.gastrogobackend.booking.interfaces.rest.transform.MenuResourceFromEntityAssembler;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/menu", produces = MediaType.APPLICATION_JSON_VALUE)
//@Tag(name = "Menu", description = "Menu Management Endpoints")

public class MenuController {

    private final MenuCommandService menuCommandService;
    private final MenuQueryService menuQueryService;

    public MenuController(MenuCommandService menuCommandService, MenuQueryService menuQueryService) {
        this.menuCommandService = menuCommandService;
        this.menuQueryService = menuQueryService;
    }

    @PostMapping
    public ResponseEntity<MenuResource> createMenu(@RequestBody CreateMenuResource resource) {
        var createMenuCommand = CreateMenuCommandFromResourceAssembler.toCommandFromResource(resource);
        var menu= menuCommandService.handle(createMenuCommand);
        if(menu.isEmpty()) return ResponseEntity.badRequest().build();
        var menuResource = MenuResourceFromEntityAssembler.toResourceFromEntity(menu.get());
        return new ResponseEntity<>(menuResource, HttpStatus.CREATED);

    }

    @GetMapping("/{menuId}")
    public ResponseEntity<MenuResource> getMenuById(@PathVariable Long menuId) {
        var getMenuByIdQuery = new GetMenuByIdQuery(menuId);
        var menu = menuQueryService.handle(getMenuByIdQuery);
        if(menu.isEmpty()) return ResponseEntity.badRequest().build();
        var menuResource = MenuResourceFromEntityAssembler.toResourceFromEntity(menu.get());
        return ResponseEntity.ok(menuResource);

    }


}
