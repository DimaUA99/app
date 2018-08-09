package hebron.app.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class User {

    @Id
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String login;

    private String password;

//    private Role role;

    private String animal;
}
