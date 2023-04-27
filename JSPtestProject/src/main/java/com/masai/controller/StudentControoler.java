package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Student;
import com.masai.service.StudentService;

@RestController
public class StudentControoler {

	@Autowired
	private StudentService sServ;
	
	@PostMapping("/student")
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
		return new ResponseEntity<Student>(sServ.addStudent(student), HttpStatus.OK);
	}
	
	@GetMapping("/student")
	public ResponseEntity<List<Student>> getAllStudent(){
		return new ResponseEntity<List<Student>>(sServ.getAllStudent(), HttpStatus.OK);
	}
}
