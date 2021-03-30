package com.michaelklanica.springmvcrest.services;


import com.michaelklanica.springmvcrest.domain.Order;

import java.util.List;

public interface OrderService {

    Order findOrderById(Long id);
    List<Order> findAllOrders();
    Order saveOrder(Order order);
}
