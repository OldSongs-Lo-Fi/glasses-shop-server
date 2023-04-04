package ua.shop.glasses.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.*;

@Entity
@Table(name="glass_all")
public class Glass implements Serializable {

    //ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Basic Variables
    @Column(
            nullable = false,
            columnDefinition = "varchar(30)"
    )
    private String name;

    @Column(
            nullable = true,
            columnDefinition = "TEXT"
    )
    private String description;

    @Column(
            nullable = false,
            columnDefinition = "int"
    )
    private int price;


    @Column(
            nullable = true,
            columnDefinition = "VARCHAR(15)"
    )
    private String material;


    @Column(
            nullable = false,
            columnDefinition = "text"
    )
    private String image;

    //Difficult variables
    @ElementCollection
    private Map<String, String> size = new HashMap<>();

    @ElementCollection
    @CollectionTable(name = "glass_complect", joinColumns = @JoinColumn(name = "glass_id"))
    @Column(name = "complect")
    private List<String> complect = new ArrayList<>();




    public Glass() {

    }

    public Glass(String name, String description, int price, String material, Map<String, String> size, ArrayList<String> complect, String image) {
        this.image = image;
        this.name = name;
        this.description = description;
        this.price = price;
        this.material = material;
        this.size = size;
        this.complect = complect;
    }

    @Override
    public String toString() {
        return "Glass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", material='" + material + '\'' +
                ", image=" + image +
                ", size=" + size +
                ", complect=" + complect +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Map<String, String> getSize() {
        return size;
    }

    public void setSize(Map<String, String> size) {
        this.size = size;
    }

    public List<String> getComplect() {
        return complect;
    }

    public void setComplect(List<String> complect) {
        this.complect = complect;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
