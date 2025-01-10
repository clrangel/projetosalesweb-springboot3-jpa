package com.saleswebapplication.salesweb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saleswebapplication.salesweb.entities.Order;
import com.saleswebapplication.salesweb.repositories.OrderRepository;

//Essa anotattion, assim como a Component, registra o serviço
@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}

}
