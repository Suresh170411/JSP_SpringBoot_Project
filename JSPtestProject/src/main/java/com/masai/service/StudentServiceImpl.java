package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Student;
import com.masai.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo sRepo;
	
	@Override
	public Student addStudent(Student student) {
		return sRepo.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		return sRepo.findAll();
	}

}
