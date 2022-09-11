package com.SimplonOcto.API.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


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
public class ResitController {

	@Autowired
	private ResitRepository rr;

	@GetMapping("/resits")
	public Iterable<Resit> getResits(){
		return rr.findAll();
	}
	@GetMapping("/resits/ef")
	public Iterable<Resit> getResitsEf(){
		return rr.findByStatus("ef");
	}
	@GetMapping("/resits/efno")
	public Iterable<Resit> getResitsEfno(){
		return rr.findByStatus("efno");
	}

	@GetMapping("/resits/noef")
	public Iterable<Resit> getResitsNoef(){
		return rr.findByStatus("noef");
	}

	@GetMapping("/resitsbyteacher")
	public List<Resit> professeurLIst(Model model, @RequestParam(required = false) Optional <Integer> id) {

		return rr.findAllByTeacherId(id);
	}

}




/*
	@RequestMapping(value = { "/rattrapage" }, method = RequestMethod.GET)
	public String getResits(Model model) {

		List<Resit> rattrapages = (List<Resit>) rr.findAll();

		List<Resit> rattraEf = (List<Resit>) rr.findByStatus("ef");
		List<Resit> rattraEfno = (List<Resit>) rr.findByStatus("efno");
		List<Resit> rattraNoef = (List<Resit>) rr.findByStatus("noef");

System.out.println(rattrapages);

		model.addAttribute("rattrapages", rattrapages);
		model.addAttribute("ef", rattraEf);
		model.addAttribute("efno", rattraEfno);
		model.addAttribute("noef", rattraNoef);

		return "supervisor";
	}

	@RequestMapping(value = { "/rattrapage/ajouter" }, method = RequestMethod.POST)
	public Resit createResit(@RequestBody Resit resit) {
		return rr.save(resit);
	}*/
