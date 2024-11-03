package pe.upc.gastrogobackend.team_activities.domain.model.valueobjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @summary Objeto de valor que representa un miembro del equipo.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    private String memberName;
}