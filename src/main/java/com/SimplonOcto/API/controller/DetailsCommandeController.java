package com.SimplonOcto.API.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.SimplonOcto.API.model.DetailsCommande;
import com.SimplonOcto.API.service.DetailsCommandeService;

@RestController
public class DetailsCommandeController {
	
	@Autowired
	private DetailsCommandeService dcs;

	@GetMapping("/details")
	public Iterable<DetailsCommande> getDetailsCommandes(){
		return dcs.getAllDetails();
	}
	
	@GetMapping("/detail/{id}")
	public Optional<DetailsCommande> getDetail(@PathVariable("id") String id){
		return dcs.getDetail(id);
	}
	
}