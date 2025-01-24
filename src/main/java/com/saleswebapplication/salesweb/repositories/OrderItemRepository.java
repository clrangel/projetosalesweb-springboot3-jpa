package com.saleswebapplication.salesweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saleswebapplication.salesweb.entities.OrderItem;
import com.saleswebapplication.salesweb.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
