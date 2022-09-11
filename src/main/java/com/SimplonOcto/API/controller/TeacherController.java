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

import com.SimplonOcto.API.model.Teacher;
import com.SimplonOcto.API.model.TeacherRepository;
import com.SimplonOcto.API.model.Resit;
import com.SimplonOcto.API.model.ResitRepository;

@Controller
public class TeacherController {

	@Autowired
	private ResitRepository rr;
	
	@Autowired
	private TeacherRepository tr;
	
	@RequestMapping(value = { "/professeur" }, method = RequestMethod.GET)
	public String professeurLIst(Model model, @RequestParam(required = false) Optional <Integer> id) {
		
		//Optional<Rattrapage> rattr = rr.findById(5);

		List<Teacher> profs = (List<Teacher>) tr.findAll();
		List<Resit> rattrapages = (List<Resit>) rr.findAll();
		List<Resit> rattrapagesById = (List<Resit>) rr.findAllByTeacherId(id);
	
		model.addAttribute("profs", profs );
		model.addAttribute("rattr", rattrapages );
		model.addAttribute("rattrById", rattrapagesById );
		
		System.out.println(id);

		return "teacher";
		}

}

		
