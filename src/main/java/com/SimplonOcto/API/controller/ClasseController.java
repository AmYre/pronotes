package com.SimplonOcto.API.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.SimplonOcto.API.model.ClasseRepository;
import com.SimplonOcto.API.model.Classe;


@Controller
public class ClasseController {

	@Autowired
	private ClasseRepository cls;
	
	@RequestMapping(value = { "/classe" }, method = RequestMethod.GET)
	public String ClassesList(Model model) {
		
		List<Classe> classes = (List<Classe>) cls.findAll();

		model.addAttribute("classes", classes);

		return "classesList";
	}
}