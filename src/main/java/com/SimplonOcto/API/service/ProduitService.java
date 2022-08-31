package com.SimplonOcto.API.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SimplonOcto.API.model.Produit;
import com.SimplonOcto.API.model.ProduitRepository;

import lombok.Data;

@Data
@Service
public class ProduitService {

	@Autowired
	private ProduitRepository pr;
	
	public Optional<Produit> getProduit(final Integer id) {
		return pr.findById(id);
	}
	
	public Iterable<Produit> getAllProduits(){
		
		//List<Produit> produitsList = new ArrayList<>();
		//pr.findAll().forEach(product -> produitsList.add(product));;
		
		//return produitsList;
		return pr.findAll();
	}
	
	public void deleteProduit(final Integer id) {
		pr.deleteById(id);
	}
	
	public void insertProduit(Produit produit) {
		pr.save(produit);
	}
}
