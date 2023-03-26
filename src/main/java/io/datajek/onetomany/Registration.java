package io.datajek.onetomany;

import io.datajek.onetoone.Player;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Registration {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "player_id",referencedColumnName = "id")
    private Player pLayer;

    @ManyToOne
    @JoinColumn(name = "tournament_id",referencedColumnName = "id")
    private Tournament tournament;



    @Override
    public String toString() {
        return "Registration{" +
                "id=" + id +
                '}';
    }
}
