package ua.com.owu.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = "product")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String name;
    private String surname;

    @OneToOne (cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Product product;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public User(String name, String surname, Product product) {
        this.name = name;
        this.surname = surname;
        this.product = product;
    }
}
