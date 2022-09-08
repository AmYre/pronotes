package com.SimplonOcto.API.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.SimplonOcto.API.model.Teacher;
import com.SimplonOcto.API.model.TeacherRepository;
import com.SimplonOcto.API.model.Resit;
import com.SimplonOcto.API.model.ResitRepository;

@Controller
public class TeacherController {

	@Autowired
	private ResitRepository rr;
	
	@RequestMapping(value = { "/professeur" }, method = RequestMethod.GET)
	public String professeurLIst(Model model) {
		
		//Optional<Rattrapage> rattr = rr.findById(5);
		Optional<Resit> rattra = rr.findById(5);
		Iterable<Resit> rattr = rr.findAll();
	
		model.addAttribute("rattr", rattr );
		System.out.println(rattra);

		return "profRattrapageList";
		}

}

		
