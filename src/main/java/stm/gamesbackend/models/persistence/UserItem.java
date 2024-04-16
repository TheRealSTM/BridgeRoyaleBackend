package stm.gamesbackend.models.persistence;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "users")
public class UserItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    final private UUID userID;

    final private String email;

    final private String userName;

    final private String password;
}
