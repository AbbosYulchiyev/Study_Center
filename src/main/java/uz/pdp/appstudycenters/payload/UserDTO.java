package uz.pdp.appstudycenters.payload;

import lombok.Data;
import uz.pdp.appstudycenters.entity.Contact;

import java.util.List;

@Data
public class UserDTO {

    private String firstname;
    private String lastname;
    private Integer addressId;
    private List<Contact> contact;
    private Integer age;
    private Boolean gender;
}
