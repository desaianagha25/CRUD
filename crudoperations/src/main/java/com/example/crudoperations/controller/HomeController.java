package com.example.crudoperations.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.crudoperations.entity.Person2;
import com.example.crudoperations.repository.Person2Repository;

@RestController
public class HomeController {
	@Autowired
	private Person2Repository personRepository;

	@GetMapping("/")
	public String index() {
		return "welcome to Spring boots";
	}

	@PostMapping("/savePerson2")
	public Person2 saveData(@RequestBody Person2 person) {
		personRepository.save(person);
		return person;
	}

	@GetMapping("/getAllPerson2")
	public List<Person2> getAll() {
		List<Person2> personlist = personRepository.findAll();
		return personlist;
	}

	@DeleteMapping("/deletePerson2/{person_id}")
	public String deletePerson2(@PathVariable int person_id) {
		Person2 person = personRepository.findById(person_id).get();
		if (person != null)
			personRepository.delete(person);
		return "deleted successfully";
	}
}