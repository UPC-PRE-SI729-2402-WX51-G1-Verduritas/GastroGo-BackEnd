package pe.upc.gastrogobackend.team_activities.domain.model.aggregates;

import lombok.Data;
import lombok.NoArgsConstructor;
import pe.upc.gastrogobackend.shared.domain.model.aggregates.AuditableAbstractAggregateRoot;
import pe.upc.gastrogobackend.team_activities.domain.model.valueobjects.Member;
import pe.upc.gastrogobackend.team_activities.domain.model.valueobjects.Vote;

import java.util.List;

/**
 * @summary Agregado principal que representa un equipo.
 */
@Data
@NoArgsConstructor
public class Team extends AuditableAbstractAggregateRoot {
    private String teamName;
    private String accessCode;
    private List<Member> members;
    private List<Vote> votes;

}