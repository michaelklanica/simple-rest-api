package com.michaelklanica.springmvcrest;

import com.michaelklanica.springmvcrest.domain.Customer;
import com.michaelklanica.springmvcrest.domain.Order;
import com.michaelklanica.springmvcrest.repositories.CustomerRepository;
import com.michaelklanica.springmvcrest.repositories.OrderRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final OrderRepository orderRepository;

    public BootStrapData(CustomerRepository customerRepository, OrderRepository orderRepository) {
        this.customerRepository = customerRepository;
        this.orderRepository = orderRepository;
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

        System.out.println("Customers Saved: " + orderRepository.count());

        System.out.println("Loading Order Data");

        Order o1 = new Order();
        o1.setTrackingNum("sdf76sd78fsd777yfs87d");
        o1.setDescription("blah blah blah");
        orderRepository.save(o1);

        System.out.println("Orders Saved: " + orderRepository.count());


    }
}
