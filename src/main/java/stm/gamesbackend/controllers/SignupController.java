package stm.gamesbackend.controllers;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import stm.gamesbackend.models.api.APIResponse;
import stm.gamesbackend.models.api.UserSigninRequest;
import stm.gamesbackend.models.api.UserSignupRequest;

/**
 * Controller class for handling HTTP requests related to User operations. It handles mapping of HTTP requests
 * to specific methods and constructing HTTP responses to be returned to the client.
 */
@Controller
public class SignupController {
    @PostMapping("/signup")
    public ResponseEntity<APIResponse> signUp(@Valid @RequestBody UserSignupRequest request) {
        System.out.println("We received a request to add a user: " + request);
        return ResponseEntity.ok(APIResponse.builder().build());
    }

    @PostMapping("/signin")
    public ResponseEntity<APIResponse> signIn(@Valid @RequestBody UserSigninRequest request) {
        System.out.println("We received a request to login this user: " + request);
        return ResponseEntity.ok(APIResponse.builder().build());
    }
}
