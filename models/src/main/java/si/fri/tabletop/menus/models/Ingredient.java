package si.fri.tabletop.menus.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.eclipse.persistence.annotations.UuidGenerator;

import javax.persistence.*;
import java.util.List;

@Entity(name = "ingredients")
@NamedQueries(value =
        {
                @NamedQuery(name = "Ingredient.getAll", query = "SELECT i FROM ingredients i"),
        })
@UuidGenerator(name = "idGenerator")
public class Ingredient {

    @Id
    @GeneratedValue(generator = "idGenerator")
    private String id;

    private String title;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="food_ingredient",
            joinColumns = @JoinColumn(name = "food_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "ingredient_id", referencedColumnName = "id"))
    @JsonBackReference
    private List<Food> food;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Food> getFood() {
        return food;
    }

    public void setFood(List<Food> food) {
        this.food = food;
    }
}
