package guru.springframework.msscbrewery.web.model.v2;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
@Builder
public class BeerDtoV2 {

    @Null
    private UUID id;
    @NotBlank
    private String beerName;

    private BeerStyle beerStyle;
    @Positive
    private Long upc;
}
