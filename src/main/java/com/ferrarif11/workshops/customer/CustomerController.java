package com.ferrarif11.workshops.customer;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/create")
    public Customer createCustomer(@RequestBody(required = false) Optional<Customer> customer) {
        return customerService.createCustomer(customer.orElse(new Customer()));
    }

    @GetMapping("/{id}")
    public Customer getACustomers(@PathVariable String id) {
        return customerService.findCustomer(UUID.fromString(id))
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/")
    public List<Customer> getCustomers() {
        return customerService.getAll();
    }

}
