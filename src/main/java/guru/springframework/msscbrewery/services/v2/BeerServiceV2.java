package guru.springframework.msscbrewery.services.v2;

import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 create(BeerDtoV2 beerDto);

    void update(UUID id, BeerDtoV2 beerDto);

    void delete(UUID id);
}
