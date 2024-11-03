package pe.upc.gastrogobackend.team_activities.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @summary DTO para la solicitud de creación de equipo por el líder.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeamCreationRequest {
    private String teamName;
}
