package pe.upc.gastrogobackend.shared.domain.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter @Setter
    @Column(nullable = false)
    private String name;

    @Getter @Setter
    @Enumerated(EnumType.STRING)
    private Role role;

    @Getter @Setter
    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    public enum Role {
        LEADER,
        MEMBER
    }
}
