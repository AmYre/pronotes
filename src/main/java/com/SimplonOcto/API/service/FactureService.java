package com.SimplonOcto.API.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SimplonOcto.API.model.Facture;
import com.SimplonOcto.API.model.FactureRepository;

import lombok.Data;

@Data
@Service
public class FactureService {

	@Autowired
	private FactureRepository fr;
	
	public Optional<Facture> getFacture(final String id) {
		return fr.findById(id);
	}
	
	public Iterable<Facture> getAllFactures(){
		return fr.findAll();
	}
	
	public void deleteFacture(final String id) {
		fr.deleteById(id);
	}
	
	public void insertFacture(Facture facture) {
		fr.save(facture);
	}
}
