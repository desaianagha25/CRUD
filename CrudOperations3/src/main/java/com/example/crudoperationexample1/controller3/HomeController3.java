package com.example.crudoperationexample1.controller3;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudoperationexample1.entity3.Subject;
import com.example.crudoperationexample1.repository3.SubjectRepository;

@RestController
public class HomeController3 {

	@Autowired
	private SubjectRepository subjectRepository;

	@GetMapping("/")
	public String index1() {
		return "Hello to Spring boots";

	}

	@PostMapping("/savingData")
	public Subject saveData(@RequestBody Subject subject) {
		subjectRepository.save(subject);
		return subject;
	}

	@GetMapping("/getAllSubject")
	public List<Subject> getAll() {
		List<Subject> subjectlist = subjectRepository.findAll();
		return subjectlist;
	}

	@DeleteMapping("/deleteSubject/{subject_id}")
	public String deletePerson2(@PathVariable int subject_id) {
		Subject subject = subjectRepository.findById(subject_id).get();
		if (subject != null)
			subjectRepository.delete(subject);
		return "deleted successfully";
	}

	@PutMapping("/updateData")
	public Subject updatesubData(@RequestBody Subject subject) {
		subjectRepository.save(subject);
		return subject;
	}

//for fetching the single data
	@GetMapping("/getSubject/{subject_id}")
	public Subject getSubjectdata(@PathVariable int subject_id) {
		Optional<Subject> subject = subjectRepository.findById(subject_id);
		Subject subject1 = subject.get();
		return subject1;
	}

}
