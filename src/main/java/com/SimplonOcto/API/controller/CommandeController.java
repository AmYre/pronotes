package com.SimplonOcto.API.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.SimplonOcto.API.model.Commande;
import com.SimplonOcto.API.service.CommandeService;

@RestController
public class CommandeController {
	
	@Autowired
	private CommandeService coms;

	@GetMapping("/commandes")
	public Iterable<Commande> getCommandes(){
		return coms.getAllCommandes();
	}
	
	@GetMapping("/commande/{id}")
	public Optional<Commande> getClient(@PathVariable("id") String id){
		return coms.getCommande(id);
	}
}