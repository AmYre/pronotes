package com.SimplonOcto.API.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import com.SimplonOcto.API.model.Rattrapage;
import com.SimplonOcto.API.model.RattrapageRepository;
import com.SimplonOcto.API.service.RattrapageService;

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
public class RattrapageController {
	
	@Autowired
	private RattrapageRepository rr;

	@RequestMapping(value = { "/rattrapage" }, method = RequestMethod.GET)
	public String rattrapageList(Model model) {
		
		List<Rattrapage> rattrapages = (List<Rattrapage>) rr.findAll();

		model.addAttribute("rattrapages", rattrapages);

		return "rattrapageList";
	}



}