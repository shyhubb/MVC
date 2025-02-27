package shyhub.vn.hub.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // dinh nghia 1 class anh xa thanh table trong database
// @Table(name = "Client") : anotation dinh nghia ten bang trong database
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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}