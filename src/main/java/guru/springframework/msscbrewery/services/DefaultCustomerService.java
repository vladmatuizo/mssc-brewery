package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DefaultCustomerService implements CustomerService {
    @Override
    public CustomerDto getById(final UUID uuid) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .customerName("Customer name")
                .build();
    }

    @Override
    public CustomerDto create(final CustomerDto customerDto) {
        return customerDto;
    }

    @Override
    public void update(final UUID id, final CustomerDto customerDto) {

    }

    @Override
    public void delete(final UUID id) {

    }
}
