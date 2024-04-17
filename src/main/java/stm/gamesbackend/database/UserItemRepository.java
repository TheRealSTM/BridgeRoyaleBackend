package stm.gamesbackend.database;

import org.springframework.data.jpa.repository.JpaRepository;
import stm.gamesbackend.models.persistence.UserItem;

public interface UserItemRepository extends JpaRepository<UserItem, Integer> {
    UserItem findByUsername(String username);
}
