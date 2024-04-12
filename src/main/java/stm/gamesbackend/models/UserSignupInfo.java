package stm.gamesbackend.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.RequiredArgsConstructor;


/**
 * Represents information required for a user to sign up.
 */
@Data
@RequiredArgsConstructor
public class UserSignupInfo {
    @NotNull(message = "firstName is required.")
    @Size(min = 1, max = 30, message = "firstName must be between 1 and 30 characters long.")
    final private String firstName;

    @NotNull(message = "lastName is required.")
    @Size(min = 1, max = 30, message = "lastName must be between 1 and 30 characters long.")
    final private String lastName;

    @NotNull(message = "userName is required.")
    @Size(min = 1, max = 30, message = "userName must be between 1 and 30 characters long.")
    final private String userName;

    @NotNull(message = "email is required.")
    @Email(message = "A valid email must be provided.")
    final private String email;

    @NotNull(message = "password is required.")
    @Size(min = 8, max = 32, message = "firstName must be between 8 and 32 characters long.")
    final private String password;
}
