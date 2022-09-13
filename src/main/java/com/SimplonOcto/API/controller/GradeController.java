package com.SimplonOcto.API.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.SimplonOcto.API.model.Grade;
import com.SimplonOcto.API.model.GradeRepository;
import com.SimplonOcto.API.model.Resit;
import com.SimplonOcto.API.model.ResitRepository;
import com.SimplonOcto.API.model.Teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GradeController {

	@Autowired
	private GradeRepository gr;

	@GetMapping("/grades")
	public Iterable<Grade> getGrades(){
		return gr.findAll();
	}
	
	@GetMapping("/gradesbyresit")
	public List<Grade> professeurLIst(Model model, @RequestParam(required = false) Optional <Integer> id) {

		return gr.findAllByResitId(id);
	}


}
