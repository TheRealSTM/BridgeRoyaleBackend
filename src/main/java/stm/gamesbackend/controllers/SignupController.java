package stm.gamesbackend.controllers;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import stm.gamesbackend.models.APIResponse;
import stm.gamesbackend.models.UserSignupInfo;

import java.util.ArrayList;
import java.util.List;

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

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<APIResponse> handleValidationExceptions(MethodArgumentNotValidException ex) {
        List<String> errors = new ArrayList<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String errorMessage = error.getDefaultMessage();
            errors.add(errorMessage);
        });
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(APIResponse.builder().errors(errors).build());
    }
}
