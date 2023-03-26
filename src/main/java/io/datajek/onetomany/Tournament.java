package io.datajek.onetomany;

import io.datajek.manytomany.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Tournament {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String location;

    @OneToMany(mappedBy = "tournament",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Registration> registrations=new ArrayList<>();

//    @ManyToMany
//    @JoinTable(name = "tournament_categories",
//    joinColumns = @JoinColumn (name = "tournament_id"),
//    inverseJoinColumns = @JoinColumn(name="category_id"))
//    private List<Category> categories =new ArrayList<>();



    @Override
    public String toString() {
        return "Tournament{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
