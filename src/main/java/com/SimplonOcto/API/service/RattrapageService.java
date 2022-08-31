package com.SimplonOcto.API.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SimplonOcto.API.model.Rattrapage;
import com.SimplonOcto.API.model.RattrapageRepository;

import lombok.Data;

@Data
@Service
public class RattrapageService {

	@Autowired
	private RattrapageRepository rs;
	
	public Optional<Rattrapage> getRattrapage(final Integer id) {
		return rs.findById(id);
	}
	
	public Iterable<Rattrapage> getAllRattrapages(){
		
		//List<Produit> produitsList = new ArrayList<>();
		//pr.findAll().forEach(product -> produitsList.add(product));;
		
		//return produitsList;
		return rs.findAll();
	}
	
	public void deleteRattrapage(final Integer id) {
		rs.deleteById(id);
	}
	
	public void insertRattrapage(Rattrapage rattrapage) {
		rs.save(rattrapage);
	}
}
