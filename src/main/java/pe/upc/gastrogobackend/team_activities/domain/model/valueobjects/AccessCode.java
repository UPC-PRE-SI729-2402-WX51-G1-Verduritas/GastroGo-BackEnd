package pe.upc.gastrogobackend.team_activities.domain.model.valueobjects;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @summary Objeto de valor que representa el código de acceso de un equipo.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccessCode {
    private String value;
}
