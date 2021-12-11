package cdarenas.springframework.msscbrewery.services;

import cdarenas.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customertId, CustomerDto customerDto);

    void deleteCustomerById(UUID customerId);
}
