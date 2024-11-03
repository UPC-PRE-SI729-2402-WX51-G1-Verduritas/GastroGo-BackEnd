package pe.upc.gastrogobackend.team_activities.infrastructure.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import pe.upc.gastrogobackend.shared.domain.model.entities.AuditableModel;

import java.io.Serializable;


/**
 * @summary Entidad JPA que representa la tabla de equipos en la base de datos.
 */
@Data
@Entity
@Table(name = "teams")
public class TeamEntity extends AuditableModel implements Serializable {
    private String teamName;
    private String accessCode;
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}