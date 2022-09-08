package com.SimplonOcto.API.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import com.SimplonOcto.API.model.Resit;
import com.SimplonOcto.API.model.ResitRepository;

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
public class ResitController {
	
	@Autowired
	private ResitRepository rr;

	@RequestMapping(value = { "/rattrapage" }, method = RequestMethod.GET)
	public String rattrapageList(Model model) {
		
		List<Resit> rattrapages = (List<Resit>) rr.findAll();
		List<Resit> rattraEf = (List<Resit>) rr.findByStatus("ef");
		List<Resit> rattraEfno = (List<Resit>) rr.findByStatus("efno");
		List<Resit> rattraNoef = (List<Resit>) rr.findByStatus("noef");

		model.addAttribute("rattrapages", rattrapages);
		model.addAttribute("ef", rattraEf);
		model.addAttribute("efno", rattraEfno);
		model.addAttribute("noef", rattraNoef);

		return "respRattrapageList";
	}
	


}