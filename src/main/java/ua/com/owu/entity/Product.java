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
@ToString(exclude = "user")

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    private String pName;
    private String PType;


    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "product")
    private User user;


    public Product(String pName, String PType) {
        this.pName = pName;
        this.PType = PType;
    }

    public Product(String pName, String PType, User user) {
        this.pName = pName;
        this.PType = PType;
        this.user = user;
    }
}


