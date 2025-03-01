
package shyhub.vn.hub.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "oders")
public class Oder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private double totalPrice;

    // Ánh xạ quan hệ ManyToOne với User
    @ManyToOne
    @JoinColumn(name = "user_id") // Cột user_id trong bảng oder
    private User user;

    // Ánh xạ quan hệ OneToMany với OderDetail
    @OneToMany(mappedBy = "oder")
    private List<OderDetail> oderDetails;

    // Getters và setters
    public long getId() {
        return id;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
