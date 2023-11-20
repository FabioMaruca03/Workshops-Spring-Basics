package com.ferrarif11.workshops.customer;

import java.util.UUID;

public record Customer(UUID id, String name, String email) {
}
