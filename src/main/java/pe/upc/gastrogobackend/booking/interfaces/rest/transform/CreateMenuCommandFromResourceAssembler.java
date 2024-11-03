package pe.upc.gastrogobackend.booking.interfaces.rest.transform;

import pe.upc.gastrogobackend.booking.domain.model.commnads.CreateMenuCommand;
import pe.upc.gastrogobackend.booking.interfaces.rest.resources.CreateMenuResource;

public class CreateMenuCommandFromResourceAssembler {
    public static CreateMenuCommand toCommandFromResource (CreateMenuResource resource) {
        return new CreateMenuCommand(resource.name(), resource.products());

    }
}
