package stm.gamesbackend.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import stm.gamesbackend.database.UserItemRepository;
import stm.gamesbackend.mappers.UserMapper;
import stm.gamesbackend.models.api.APIResponse;
import stm.gamesbackend.models.api.UserSigninRequest;
import stm.gamesbackend.models.api.UserSignupRequest;
import stm.gamesbackend.models.persistence.UserItem;

import java.util.List;

/**
 * Controller class for handling HTTP requests related to User operations. It handles mapping of HTTP requests
 * to specific methods and constructing HTTP responses to be returned to the client.
 */
@Controller
@RequiredArgsConstructor
public class SignupController {
    final UserItemRepository userItemRepository;

    final UserMapper userMapper;

    @PostMapping("/signup")
    public ResponseEntity<APIResponse> signUp(@Valid @RequestBody UserSignupRequest request) {
        System.out.println("We received a request to add a user: " + request);
        UserItem userItem = userMapper.convertSignupRequestToUserItem(request);
        userItemRepository.save(userItem);
        return ResponseEntity.ok(APIResponse.builder().errors(List.of()).build());
    }

    @PostMapping("/signin")
    public ResponseEntity<APIResponse> signIn(@Valid @RequestBody UserSigninRequest request) {
        System.out.println("We received a request to login this user: " + request);
        return ResponseEntity.ok(APIResponse.builder().build());
    }
}
