package com.SimplonOcto.API.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.SimplonOcto.API.model.Teacher;
import com.SimplonOcto.API.model.TeacherRepository;
import com.SimplonOcto.API.model.Resit;
import com.SimplonOcto.API.model.ResitRepository;

@RestController
public class TeacherController {

	@Autowired
	private ResitRepository rr;
	
	@Autowired
	private TeacherRepository tr;
	
	@GetMapping("/teachers")
	public Iterable<Teacher> teacherList() {
		return tr.findAll();
	}

}

		
