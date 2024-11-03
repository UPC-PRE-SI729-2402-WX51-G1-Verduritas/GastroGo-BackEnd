package pe.upc.gastrogobackend.team_activities.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @summary DTO para la solicitud de unión al equipo por el miembro.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JoinTeamRequest {
    private String accessCode;
}
