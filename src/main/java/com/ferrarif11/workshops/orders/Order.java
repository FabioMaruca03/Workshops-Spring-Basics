package com.ferrarif11.workshops.orders;

import com.ferrarif11.workshops.customer.Customer;
import com.ferrarif11.workshops.products.Product;

import java.util.UUID;

public record Order(UUID id, Customer customer, Product product, int quantity) {
}
