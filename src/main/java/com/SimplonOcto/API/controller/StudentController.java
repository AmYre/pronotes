package com.SimplonOcto.API.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.SimplonOcto.API.model.StudentRepository;
import com.SimplonOcto.API.model.Resit;
import com.SimplonOcto.API.model.Student;

@RestController
public class StudentController {

	@Autowired
	private StudentRepository etr;
	
	@GetMapping("/students")
	public Iterable<Student> getStudents(){
		return etr.findAll();
	}
}
