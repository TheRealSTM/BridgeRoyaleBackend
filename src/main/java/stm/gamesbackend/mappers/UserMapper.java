package stm.gamesbackend.mappers;

import org.springframework.stereotype.Component;
import stm.gamesbackend.models.api.UserSignupRequest;
import stm.gamesbackend.models.persistence.UserItem;

import java.util.Date;

/**
 * This class is responsible for mapping classes related to the User data.
 */
@Component
public class UserMapper {
    public UserItem convertSignupRequestToUserItem(UserSignupRequest signupRequest) {
        return UserItem.builder()
                .accountCreationDate(new Date())
                .email(signupRequest.getEmail())
                .username(signupRequest.getUserName())
                .password(signupRequest.getPassword())
                .build();
    }
}
