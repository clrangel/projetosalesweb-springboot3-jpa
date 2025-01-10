package com.saleswebapplication.salesweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saleswebapplication.salesweb.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
