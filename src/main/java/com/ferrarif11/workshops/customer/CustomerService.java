package com.ferrarif11.workshops.customer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository repository;

    public Customer createCustomer(Customer customer) {
        return repository.save(customer);
    }

    public List<Customer> getAll() {
        return repository.findAll();
    }

    public Optional<Customer> findCustomer(UUID id) {
        return repository.findById(id);
    }

    public void printALl() {
        repository.findAll().forEach(System.out::println);
    }
}
