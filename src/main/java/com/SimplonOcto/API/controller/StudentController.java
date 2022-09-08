package com.SimplonOcto.API.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.SimplonOcto.API.model.StudentRepository;
import com.SimplonOcto.API.model.Student;

@Controller
public class StudentController {

	@Autowired
	private StudentRepository etr;
	
	@RequestMapping(value = { "/etudiant"}, method = RequestMethod.GET)
	public String EtudiantList(Model model) {
		
		List<Student> etudiants = (List<Student>) etr.findAll();
		
		model.addAttribute("etudiants", etudiants);
		
		return "etudiantList";
	}
}
