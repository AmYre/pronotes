package com.SimplonOcto.API.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SimplonOcto.API.model.Resit;
import com.SimplonOcto.API.model.ResitRepository;

import lombok.Data;

@Data
@Service
public class ResitService {

	@Autowired
	private ResitRepository rr;
	
	public Optional<Resit> getResit(final Integer id) {
		return rr.findById(id);
	}
	
	public Iterable<Resit> getAllResits(){
		
		//List<Produit> produitsList = new ArrayList<>();
		//pr.findAll().forEach(product -> produitsList.add(product));;
		
		//return produitsList;
		return rr.findAll();
	}
	
	public void deleteResit(final Integer id) {
		rr.deleteById(id);
	}
	
	public void insertResit(Resit rattrapage) {
		rr.save(rattrapage);
	}
}
