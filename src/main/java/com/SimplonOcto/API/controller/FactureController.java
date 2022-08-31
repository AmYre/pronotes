package com.SimplonOcto.API.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.SimplonOcto.API.model.Facture;
import com.SimplonOcto.API.service.FactureService;

@RestController
public class FactureController {
	
	@Autowired
	private FactureService fs;

	@GetMapping("/factures")
	public Iterable<Facture> getFactures(){
		return fs.getAllFactures();
	}
	
	@GetMapping("/facture/{id}")
	public Optional<Facture> getFacture(@PathVariable("id") String id){
		return fs.getFacture(id);
	}
}