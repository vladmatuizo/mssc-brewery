package guru.springframework.msscbrewery.services.v2;

import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;
import guru.springframework.msscbrewery.web.model.v2.BeerStyle;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DefaultBeerServiceV2 implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyle.ALE)
                .build();
    }

    @Override
    public BeerDtoV2 create(final BeerDtoV2 beerDto) {
        return beerDto;
    }

    @Override
    public void update(final UUID id, final BeerDtoV2 beerDto) {

    }

    @Override
    public void delete(final UUID id) {

    }
}
