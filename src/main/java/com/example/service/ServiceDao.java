package com.example.service;

import org.springframework.stereotype.Service;

import com.example.model.Person;
@Service
public interface ServiceDao {
	
  public void save(Person person);
}
