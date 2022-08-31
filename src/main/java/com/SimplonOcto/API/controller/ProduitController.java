package com.SimplonOcto.API.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.SimplonOcto.API.model.Produit;
import com.SimplonOcto.API.service.ProduitService;

@RestController
public class ProduitController {
	
	@Autowired
	private ProduitService ps;

	@GetMapping("/produits")
	public Iterable<Produit> getProduits(){
		return ps.getAllProduits();
	}
	
	@GetMapping("/produit/{id}")
	public Optional<Produit> getProduit(@PathVariable("id") Integer id){
		return ps.getProduit(id);
	}
}