package com.SimplonOcto.API.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.SimplonOcto.API.model.Professeur;
import com.SimplonOcto.API.model.ProfesseurRepository;

@Controller
public class ProfesseurController {
	
	@Autowired
	private ProfesseurRepository pr;


	
	@RequestMapping(value = { "/professeur" }, method = RequestMethod.GET)
	public String professeurLIst(Model model) {
		
		List<Professeur> professeurs = (List<Professeur>) pr.findAll();
		model.addAttribute("professeurs", professeurs );

		return "professeurList";
		}

}

		
