package com.saleswebapplication.salesweb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saleswebapplication.salesweb.entities.Category;
import com.saleswebapplication.salesweb.repositories.CategoryRepository;

//Essa anotattion, assim como a Component, registra o serviço
@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}

}
