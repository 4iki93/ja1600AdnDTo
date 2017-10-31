package ua.com.owu.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString

public class UserProductDTO {
    private int userID;
    private int productID;

    private String name;
    private String surname;
    private String pName;
    private String pType;






}
