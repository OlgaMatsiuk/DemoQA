package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.testng.annotations.Test;

@Getter
@Setter
@Builder
@ToString

public class StudentDTO {
    String firstName;
    String lastName;
    String email;
    String gender;
    String phone;
    String birthday;
    String subjects;
    String hobbies;
    String address;
    String state;
    String city;


}
