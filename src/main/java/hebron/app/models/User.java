package hebron.app.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@Table(name="\"user\"")
public class User {

    @Id
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String login;

    private String password; //MD5, SHA-512, AES, RSA

//    private Role role;

    private String animal;
}
