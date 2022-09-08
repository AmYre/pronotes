package com.SimplonOcto.API.controller;


import java.util.List;

import com.SimplonOcto.API.model.OverseerRepository;
import com.SimplonOcto.API.model.Overseer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OverseerController {
	
	@Autowired
	private OverseerRepository sr;

	@RequestMapping(value = { "/surveillant" }, method = RequestMethod.GET)
	public String SurveillantList(Model model) {
		
		List<Overseer> surveillants = (List<Overseer>) sr.findAll();

		model.addAttribute("surveillants", surveillants);

		return "surveillantList";
	}



}