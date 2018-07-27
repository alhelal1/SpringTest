package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Person;
import com.example.repository.AddressRepository;
import com.example.repository.PersonRepository;

@Service
public class ServiceDaoImpl implements ServiceDao {
	@Autowired
	PersonRepository personRepository;
	@Autowired
	AddressRepository addressRepository;

	public void save(Person person) {
		personRepository.save(person);
	}

}
