package ua.shop.glasses.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "order_all")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(
            name = "full_name",
            nullable = false,
            columnDefinition = "varchar(45)"
    )
    private String fullName;

    @Column(
            nullable = false,
            columnDefinition = "varchar(20)"
    )
    private String mobilePhone;

    @Column(
            name = "city",
            nullable = false,
            columnDefinition = "varchar(50)"
    )
    private String city;

    @Column(
            name = "mail",
            nullable = false,
            columnDefinition = "varchar(254)"
    )
    private String mail;

    @Column(
            name = "mailAddress",
            nullable = false,
            columnDefinition = "text"
    )
    private String mailAddress;

    @Column(
            name = "email",
            nullable = false,
            columnDefinition = "varchar(30)"
    )
    private String email;

    @Column(
            name="price",
            nullable = false,
            columnDefinition = "INT"
    )
    private int price;



    @ElementCollection
    @CollectionTable(name = "order_products", joinColumns = @JoinColumn(name = "order_id"))
    @Column(name = "products")

    private List<Integer> products = new ArrayList<>();




    public Order(String fullName,
                 String mobilePhone,
                 String city,
                 String mail,
                 String mailAddress,
                 String email,
                 List<Integer> products,
                 int price) {
        this.fullName = fullName;
        this.mobilePhone = mobilePhone;
        this.city = city;
        this.mail = mail;
        this.mailAddress = mailAddress;
        this.email = email;
        this.products = products;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", city='" + city + '\'' +
                ", mail='" + mail + '\'' +
                ", mailAddress='" + mailAddress + '\'' +
                ", email='" + email + '\'' +
                ", price=" + price +
                ", products=" + products +
                '}';
    }

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Integer> getProducts() {
        return products;
    }

    public void setProducts(List<Integer> products) {
        this.products = products;
    }
}
