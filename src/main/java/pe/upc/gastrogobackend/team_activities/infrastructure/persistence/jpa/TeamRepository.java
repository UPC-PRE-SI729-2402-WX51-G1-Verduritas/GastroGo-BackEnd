package pe.upc.gastrogobackend.team_activities.infrastructure.persistence.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.upc.gastrogobackend.team_activities.infrastructure.persistence.entities.TeamEntity;

/**
 * @summary Repositorio JPA para el agregado Team.
 */
public interface TeamRepository extends JpaRepository<TeamEntity, Long> {

}