package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.masai.service.StudentService;

@Controller
public class JspController {

	@Autowired
	private StudentService sServ;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/view_students")
	public ModelAndView getStudentList() {
		
		ModelAndView mv = new ModelAndView("view_student", "studentList", sServ.getAllStudent());
		
		return mv;
	}
}
