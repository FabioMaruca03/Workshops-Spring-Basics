package com.ferrarif11.workshops;

import com.ferrarif11.workshops.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBasicsApplication implements CommandLineRunner {

    @Autowired
    private CustomerService customerService;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootBasicsApplication.class, args);
    }

    @Override
    public void run(String... args) {
        customerService.printALl();
    }
}
