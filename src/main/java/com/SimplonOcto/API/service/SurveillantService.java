package com.SimplonOcto.API.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SimplonOcto.API.model.Surveillant;
import com.SimplonOcto.API.model.SurveillantRepository;

import lombok.Data;

@Data
@Service
public class SurveillantService {

	@Autowired
	private SurveillantRepository sr;
	
	public Optional<Surveillant> getSurveillant(final Integer id) {
		return sr.findById(id);
	}
	
	public Iterable<Surveillant> getAllSurveillants(){
		
		//List<Produit> produitsList = new ArrayList<>();
		//pr.findAll().forEach(product -> produitsList.add(product));;
		
		//return produitsList;
		return sr.findAll();
	}
	
	public void deleteSurveillant(final Integer id) {
		sr.deleteById(id);
	}
	
	public void insertSurveillant(Surveillant surveillant) {
		sr.save(surveillant);
	}
}
