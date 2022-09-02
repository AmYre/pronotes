package com.SimplonOcto.API.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.SimplonOcto.API.model.EtudiantRepository;
import com.SimplonOcto.API.model.Etudiant;

@Controller
public class EtudiantController {

	@Autowired
	private EtudiantRepository etr;
	
	@RequestMapping(value = { "/etudiant"}, method = RequestMethod.GET)
	public String EtudiantList(Model model) {
		
		List<Etudiant> etudiants = (List<Etudiant>) etr.findAll();
		
		model.addAttribute("etudiants", etudiants);
		
		return "etudiantList";
	}
}
