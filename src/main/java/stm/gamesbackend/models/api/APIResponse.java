package stm.gamesbackend.models.api;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class APIResponse {
    private List<String> errors;
}
