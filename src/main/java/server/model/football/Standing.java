package server.model.football;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Standing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String stage;

    @Column
    private String type;

    @Column
    private String groupe;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Table> table;

    @OneToOne(fetch = FetchType.LAZY)
    private Competition competition;
}
