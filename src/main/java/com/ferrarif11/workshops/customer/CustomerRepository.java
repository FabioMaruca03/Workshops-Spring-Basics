package com.ferrarif11.workshops.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, UUID> {

}
