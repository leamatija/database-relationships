package io.datajek.onetoone;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.datajek.onetomany.Registration;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

   @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="profile_id",referencedColumnName = "id")
    private PlayerProfile playerProfile;


   @OneToMany(mappedBy = "player",cascade = CascadeType.ALL)
   private List<Registration> registrations;



    public void registerPLayer(Registration rg){
        registrations.add(rg);
        rg.setpLayer(this);
    }


    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", playerProfile=" + playerProfile +
                '}';
    }
}
