package com.SimplonOcto.API.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SimplonOcto.API.model.DetailsCommande;
import com.SimplonOcto.API.model.DetailsCommandeRepository;

import lombok.Data;

@Data
@Service
public class DetailsCommandeService {

	@Autowired
	private DetailsCommandeRepository dcr;
	
	public Optional<DetailsCommande> getDetail(final String id) {
		return dcr.findById(id);
	}
	
	public Iterable<DetailsCommande> getAllDetails(){
		return dcr.findAll();
	}
	
	public void deleteDetails(final String id) {
		dcr.deleteById(id);
	}
	
	public void insertDetails(DetailsCommande details) {
		dcr.save(details);
	}
}
