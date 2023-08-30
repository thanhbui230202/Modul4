package thanhbui.signup.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
public class Signup {
    @Id
    @Column(columnDefinition = "varchar(10)")
    private String id;
    @NotBlank(message = "{signup.firstName1}")
    @Size(min = 5, max = 45, message = "{signup.firstName}")
    private String firstName;
    @NotBlank(message = "{signup.lastName1}")
    @Size(min = 5, max = 45, message = "{signup.lastName}")
    private String lastName;
    @NotBlank(message = "{signup.Phone}")
    @Pattern(regexp = "^\\d{3}-\\d{3}-\\d{4}$", message = "Follow format 0xx-xxx-xxxx")
    private String phoneNumber;
//    @NotBlank(message = "{signup.age1}")
    private int age;
    @NotBlank(message = "{signup.email1}")
    @Email(message = "{signup.email}")
    private String email;

    public Signup() {
    }

    public Signup(String id, String firstName, String lastName, String phoneNumber, int age, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
