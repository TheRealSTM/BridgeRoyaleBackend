package stm.gamesbackend.models.persistence;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;
import java.util.UUID;

@Data
@Builder
@Entity
@Table(name = "users")
public class UserItem {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id", updatable = false, nullable = false)
    private UUID userID;

    final private Date accountCreationDate;

    final private String email;

    final private String username;

    final private String password;
}
