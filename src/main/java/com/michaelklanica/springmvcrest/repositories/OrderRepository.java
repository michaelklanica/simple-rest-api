package com.michaelklanica.springmvcrest.repositories;

import com.michaelklanica.springmvcrest.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
