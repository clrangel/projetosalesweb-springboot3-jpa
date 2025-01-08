package com.saleswebapplication.salesweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saleswebapplication.salesweb.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
