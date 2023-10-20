package com.example.crudoperationexample1.controller1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudoperationexample1.repository1.SubjectRepository;


//import com.example.crudoperationexample1.repository1.SubjectRepository;


@RestController
public class HomeController1 {
	
	@Autowired
	
	private SubjectRepository subjectRepository;
	@GetMapping("/get")
	public String index() {
		return "Hello welcome to spring";
	}

}
