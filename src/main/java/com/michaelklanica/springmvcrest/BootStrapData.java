package com.michaelklanica.springmvcrest;

import com.michaelklanica.springmvcrest.domain.Customer;
import com.michaelklanica.springmvcrest.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loading Customer Data");

        Customer c1 = new Customer();
        c1.setFirstName("Mike");
        c1.setLastName("Klanica");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstName("Skye");
        c2.setLastName("Rosas");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setFirstName("Eva");
        c3.setLastName("Klanica");
        customerRepository.save(c3);

        Customer c4 = new Customer();
        c4.setFirstName("Louie");
        c4.setLastName("Rosas");
        customerRepository.save(c4);

        System.out.println("Customers Saved: " + customerRepository.count());
    }
}
