package pe.upc.gastrogobackend.team_activities.domain.model.queries;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @summary Consulta para obtener los detalles del equipo.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetTeamDetailsQuery {
    private String teamName;
}