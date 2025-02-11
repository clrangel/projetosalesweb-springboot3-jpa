package com.saleswebapplication.salesweb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saleswebapplication.salesweb.entities.User;
import com.saleswebapplication.salesweb.repositories.UserRepository;

//Essa anotattion, assim como a Component, registra o serviço
@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}

}
