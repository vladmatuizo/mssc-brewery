package guru.springframework.msscbrewery.web.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
@Builder
public class CustomerDto {
    private UUID id;
    @NotNull
    @Size(min = 3, max = 100)
    private String customerName;
}
