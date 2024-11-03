package pe.upc.gastrogobackend.team_activities.domain.model.valueobjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @summary Objeto de valor que representa un voto por un restaurante.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vote {
    private String restaurantName;
}