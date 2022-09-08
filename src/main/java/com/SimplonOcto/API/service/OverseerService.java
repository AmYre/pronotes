package com.SimplonOcto.API.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SimplonOcto.API.model.Overseer;
import com.SimplonOcto.API.model.OverseerRepository;
import com.SimplonOcto.API.model.OverseerRepository;

import lombok.Data;

@Data
@Service
public class OverseerService {

	@Autowired
	private OverseerRepository sr;
	
	public Optional<Overseer> getOverseer(final Integer id) {
		return sr.findById(id);
	}
	
	public Iterable<Overseer> getAllOverseers(){
		
		//List<Produit> produitsList = new ArrayList<>();
		//pr.findAll().forEach(product -> produitsList.add(product));;
		
		//return produitsList;
		return sr.findAll();
	}
	
	public void deleteOverseer(final Integer id) {
		sr.deleteById(id);
	}
	
	public void insertOverseer(Overseer surveillant) {
		sr.save(surveillant);
	}
}
