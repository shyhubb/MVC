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

@Entity // dinh nghia 1 class anh xa thanh table trong database
@Table(name = "users")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY) // anotation dat id mac dinh tang theo cau hinh cua database |
                                                        // vd : auto_increatment
    @Id // anh xa trong khoa chinh cho table trong database
    private long id;
    private String name;
    private String location;
    private String phone;
    private String email;
    private String password;

    private String avata;

    public User() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    // Many User - > to one -> role
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
    // relation to oder
    @OneToMany(mappedBy = "user")
    private List<Oder> oders;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAvata() {
        return avata;
    }

    public void setAvata(String avata) {
        this.avata = avata;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id= " + id +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}