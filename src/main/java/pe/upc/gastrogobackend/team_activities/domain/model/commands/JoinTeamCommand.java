package pe.upc.gastrogobackend.team_activities.domain.model.commands;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @summary Comando para unirse a un equipo.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JoinTeamCommand {
    private String accessCode;
}