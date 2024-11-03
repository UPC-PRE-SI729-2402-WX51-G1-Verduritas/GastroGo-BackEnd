package pe.upc.gastrogobackend.team_activities.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @summary DTO para la respuesta con detalles del equipo.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeamResponse {
    private String teamName;
    private int memberCount;
    private String accessCode;
    private List<String> restaurantVotes;
}