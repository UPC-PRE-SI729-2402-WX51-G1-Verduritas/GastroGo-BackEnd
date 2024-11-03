package pe.upc.gastrogobackend.team_activities.infrastructure.rest.resources;

import lombok.Data;

/**
 * @summary Recurso REST para la creación de equipos.
 */
@Data
public class CreateTeamResource {
    private String teamName;
}
