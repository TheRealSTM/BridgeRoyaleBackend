package stm.gamesbackend.models.api;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class UserSigninRequest {
    @NotNull(message = "userName is required.")
    @Size(min = 1, max = 30, message = "userName must be betweeen 1 and 30 characters long.")
    final private String userName;

    @NotNull(message = "password must not be null.")
    @Size(min = 8, max = 32, message = "password must be between 8 and 32 characters long.")
    final private String password;
}
