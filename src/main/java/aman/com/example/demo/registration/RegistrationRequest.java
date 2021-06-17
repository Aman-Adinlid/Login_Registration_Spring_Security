package aman.com.example.demo.registration;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class RegistrationRequest {

    private final String firstName;
    private final String lastName;
    private final String password;
    private final String email;

}
