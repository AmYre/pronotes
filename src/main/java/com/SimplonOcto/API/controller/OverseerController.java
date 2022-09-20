package com.SimplonOcto.API.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.SimplonOcto.API.model.Overseer;
import com.SimplonOcto.API.model.OverseerRepository;
import com.SimplonOcto.API.model.Resit;
import com.SimplonOcto.API.model.ResitRepository;

@RestController
public class OverseerController {
	
	@Autowired
	private OverseerRepository or;
	
	@Autowired
	private ResitRepository sr;
	
	@GetMapping("/overseers")
	public Iterable<Overseer> surveillantLIst(){
		return or.findAll();
	}
	@GetMapping("/overseer")
	public List<Resit> overseerLIst(@RequestParam(required = false) Optional <Integer> id) {

		return sr.findAllByOverseerId(id);
	}

		
		
		}

	





