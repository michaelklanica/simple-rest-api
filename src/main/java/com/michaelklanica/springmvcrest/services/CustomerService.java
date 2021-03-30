package com.michaelklanica.springmvcrest.services;

import com.michaelklanica.springmvcrest.domain.Customer;

import java.util.List;

public interface CustomerService {

    Customer findCustomerById(Long id);
    List<Customer> findAllCustomers();

}
