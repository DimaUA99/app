package hebron.app.controller;

import hebron.app.models.User;
import hebron.app.repositry.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/api/user")
    public ResponseEntity createUser() {
        User user = new User();
        user.setFirstName("Eddy");
        user.setLastName("Murphy");
        user.setEmail("foo@mail.com");
        userRepository.save(user);
        return ResponseEntity.ok(user);
    }



}
