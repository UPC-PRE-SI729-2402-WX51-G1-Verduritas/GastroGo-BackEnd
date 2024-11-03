package pe.upc.gastrogobackend.team_activities.domain.model.commands;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @summary Comando para enviar un voto.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubmitVoteCommand {
    private String restaurantName;
}

