package com.ferrarif11.workshops.products;

import java.math.BigDecimal;
import java.util.UUID;

public record Product(UUID id, String name, String description, String category, BigDecimal price) {
}
