package pe.upc.gastrogobackend.team_activities.infrastructure.rest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.upc.gastrogobackend.team_activities.application.dto.JoinTeamRequest;
import pe.upc.gastrogobackend.team_activities.application.dto.TeamCreationRequest;
import pe.upc.gastrogobackend.team_activities.application.dto.TeamResponse;
import pe.upc.gastrogobackend.team_activities.application.dto.VotingRequest;

/**
 * @summary Controlador REST para gestionar las actividades de equipo.
 */

@RestController
@RequestMapping("/api/team-activities")
@Tag(name = "Team Activities", description = "Endpoints para la gestión de actividades de equipo")
public class TeamController {

    @PostMapping("/create")
    @Operation(summary = "Crear un nuevo equipo", description = "Permite a un líder crear un nuevo equipo especificando el nombre.")
    public ResponseEntity<TeamResponse> createTeam(@RequestBody TeamCreationRequest request) {
        // Implementación del servicio de creación de equipo
        return ResponseEntity.ok(new TeamResponse());
    }

    @PostMapping("/join")
    @Operation(summary = "Unirse a un equipo", description = "Permite a un miembro unirse a un equipo usando el código de acceso.")
    public ResponseEntity<TeamResponse> joinTeam(@RequestBody JoinTeamRequest request) {
        // Implementación del servicio para unirse a un equipo
        return ResponseEntity.ok(new TeamResponse());
    }

    @PostMapping("/vote")
    @Operation(summary = "Votar por un restaurante", description = "Permite a un miembro votar por un restaurante en el equipo.")
    public ResponseEntity<Void> vote(@RequestBody VotingRequest request) {
        // Implementación del servicio de votación
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{teamName}")
    @Operation(summary = "Obtener detalles del equipo", description = "Obtiene información detallada del equipo, incluyendo miembros y votos.")
    public ResponseEntity<TeamResponse> getTeamDetails(@PathVariable String teamName) {
        // Implementación del servicio de consulta de equipo
        return ResponseEntity.ok(new TeamResponse());
    }
}
