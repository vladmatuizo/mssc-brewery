package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getById(UUID uuid);

    CustomerDto create(CustomerDto customerDto);

    void update(UUID id, CustomerDto customerDto);

    void delete(UUID id);
}
