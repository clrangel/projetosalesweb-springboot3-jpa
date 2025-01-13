package com.saleswebapplication.salesweb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saleswebapplication.salesweb.entities.Product;
import com.saleswebapplication.salesweb.repositories.ProductRepository;

//Essa anotattion, assim como a Component, registra o serviço
@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}

}
