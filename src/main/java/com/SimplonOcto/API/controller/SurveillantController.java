package com.SimplonOcto.API.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import com.SimplonOcto.API.model.Surveillant;
import com.SimplonOcto.API.model.SurveillantRepository;
import com.SimplonOcto.API.service.SurveillantService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SurveillantController {
	
	@Autowired
	private SurveillantRepository sr;

	@RequestMapping(value = { "/surveillant" }, method = RequestMethod.GET)
	public String SurveillantList(Model model) {
		
		List<Surveillant> surveillants = (List<Surveillant>) sr.findAll();

		model.addAttribute("surveillants", surveillants);

		return "surveillantList";
	}



}