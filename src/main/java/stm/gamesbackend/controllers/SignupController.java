package stm.gamesbackend.controllers;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import stm.gamesbackend.models.UserSignupInfo;

/**
 * Controller class for handling HTTP requests related to User operations. It handles mapping of HTTP requests
 * to specific methods and constructing HTTP responses to be returned to the client.
 */
@Controller
public class SignupController {
    @PostMapping("/signup")
    public ResponseEntity<UserSignupInfo> signUp(@Valid @RequestBody UserSignupInfo userSignupInfo) {
        System.out.println("We received a request to add a user: " + userSignupInfo);
        return new ResponseEntity<>(userSignupInfo, HttpStatus.CREATED);
    }
}
