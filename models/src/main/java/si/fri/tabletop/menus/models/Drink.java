package si.fri.tabletop.menus.models;

import org.eclipse.persistence.annotations.UuidGenerator;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name = "drinks")
@NamedQueries(value =
        {
                @NamedQuery(name = "Drink.getAll", query = "SELECT d FROM drinks d"),
        })
@UuidGenerator(name = "idGenerator")
public class Drink {

    @Id
    @GeneratedValue(generator = "idGenerator")
    private String id;

    private String title;

    private String description;

    private double price;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="menu_id")
    @JsonBackReference
    private Menu menu;

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

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
