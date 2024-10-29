package pe.upc.gastrogobackend.shared.domain.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter @Setter
    @Column(nullable = false, unique = true)
    private String name;

    @Getter @Setter
    @Column(nullable = false, unique = true)
    private String accessCode;

    @Getter @Setter
    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private List<User> members;

    public int getMemberCount() {
        return members.size();
    }
}
