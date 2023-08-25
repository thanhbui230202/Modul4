package thanhbui.signup.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Signup {
    @Id
    @Column(columnDefinition = "varchar(10)")
    private String id;
    @Size(min = 5, max = 45, message = "{signup.firstName}")
    private String firstName;
    @Size(min = 5, max = 45, message = "{signup.lastName}")
    private String lastName;
    @Pattern()
    private String phoneNumber;
    private int age;
    @Email(message = "")
    private String email;

}
