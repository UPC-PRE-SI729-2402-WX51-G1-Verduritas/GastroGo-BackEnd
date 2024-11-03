package pe.upc.gastrogobackend.team_activities.domain.model.commands;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @summary Comando para crear un equipo.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateTeamCommand {
    private String teamName;
}