package com.SimplonOcto.API.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SimplonOcto.API.model.Commande;
import com.SimplonOcto.API.model.CommandeRepository;

import lombok.Data;

@Data
@Service
public class CommandeService {

	@Autowired
	private CommandeRepository coms;
	
	public Optional<Commande> getCommande(final String id) {
		return coms.findById(id);
	}
	
	public Iterable<Commande> getAllCommandes(){
		return coms.findAll();
	}
	
	public void deleteCommande(final String id) {
		coms.deleteById(id);
	}
	
	public void insertCommande(Commande commande) {
		coms.save(commande);
	}
}
