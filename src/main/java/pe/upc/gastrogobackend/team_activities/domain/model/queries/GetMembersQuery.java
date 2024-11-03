package pe.upc.gastrogobackend.team_activities.domain.model.queries;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @summary Consulta para obtener la lista de miembros del equipo.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetMembersQuery {
    private String teamName;
}