package com.saleswebapplication.salesweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saleswebapplication.salesweb.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
