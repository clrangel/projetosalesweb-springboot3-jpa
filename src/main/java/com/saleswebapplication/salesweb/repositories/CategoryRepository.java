package com.saleswebapplication.salesweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saleswebapplication.salesweb.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
