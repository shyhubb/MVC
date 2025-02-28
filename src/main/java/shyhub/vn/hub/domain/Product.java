package shyhub.vn.hub.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private double price;
    private String image;
    private String detailDesc;
    private String shortDesc;
    private String quantity;
    private Long sold;
    private String factory;
    private String target;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }

    public String getDetailDesc() {
        return detailDesc;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public String getQuantity() {
        return quantity;
    }

    public Long getSold() {
        return sold;
    }

    public String getFactory() {
        return factory;
    }

    public String getTarget() {
        return target;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setSold(Long sold) {
        this.sold = sold;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public void setTarget(String target) {
        this.target = target;
    }

}
