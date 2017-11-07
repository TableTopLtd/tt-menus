package si.fri.tabletop.menus.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.eclipse.persistence.annotations.UuidGenerator;

import javax.persistence.*;
import java.util.List;

@Entity(name = "menus")
@NamedQueries(value =
        {
                @NamedQuery(name = "Menu.getAll", query = "SELECT m FROM menus m"),
        })
@UuidGenerator(name = "idGenerator")
public class Menu {

    @Id
    @GeneratedValue(generator = "idGenerator")
    private String id;

    @Column(name = "place_id")
    private String placeId;

    @OneToMany(mappedBy="menu")
    @JsonManagedReference
    private List<Drink> menuDrinks;

    @OneToMany(mappedBy="menu")
    @JsonManagedReference
    private List<Food> menuFood;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    public List<Drink> getMenuDrinks() {
        return menuDrinks;
    }

    public void setMenuDrinks(List<Drink> menuDrinks) {
        this.menuDrinks = menuDrinks;
    }

    public List<Food> getMenuFood() {
        return menuFood;
    }

    public void setMenuFood(List<Food> menuFood) {
        this.menuFood = menuFood;
    }
}
