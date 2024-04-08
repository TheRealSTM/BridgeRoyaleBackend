package stm.gamesbackend.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.RequiredArgsConstructor;


/**
 * Represents information required for a user to sign up.
 */
@Data
@RequiredArgsConstructor
public class UserSignupInfo {
    @NotNull
    @Size(min = 1, max = 30)
    final private String firstName;

    @NotNull
    @Size(min = 1, max = 30)
    final private String lastName;

    @NotNull
    @Size(min = 1, max = 30)
    final private String userName;

    @NotNull
    @Email
    final private String email;

    @NotNull
    @Size(min = 8, max = 32)
    final private String password;
}

