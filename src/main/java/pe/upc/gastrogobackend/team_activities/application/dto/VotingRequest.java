package pe.upc.gastrogobackend.team_activities.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @summary DTO para la solicitud de envío de voto de un miembro.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VotingRequest {
    private String restaurantName;
}