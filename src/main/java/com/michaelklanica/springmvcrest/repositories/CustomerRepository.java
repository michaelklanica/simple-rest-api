package com.michaelklanica.springmvcrest.repositories;

import com.michaelklanica.springmvcrest.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
