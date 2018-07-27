package com.example.hello.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Person;

@RestController
public class HelloController {
	
    @PostMapping("/posts")
    public Person createPost(@Valid @RequestBody Person person) {
    	return null;
        //return postRepository.save(post);
    }

}
