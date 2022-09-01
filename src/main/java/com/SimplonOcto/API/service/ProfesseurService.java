package com.SimplonOcto.API.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SimplonOcto.API.model.Professeur;
import com.SimplonOcto.API.model.ProfesseurRepository;

import lombok.Data;


	@Data
	@Service
public class ProfesseurService {

		@Autowired
private ProfesseurRepository rs;
		
public Optional<Professeur> getProfesseur(final Integer id) {
			return rs.findById(id);
		}
		
public Iterable<Professeur> getAllProfesseurs(){
			
			//List<Produit> produitsList = new ArrayList<>();
			//pr.findAll().forEach(product -> produitsList.add(product));;
			
			//return produitsList;
			return rs.findAll();
		}
		
		public void deleteProfesseur(final Integer id) {
			rs.deleteById(id);
		}
		
		public void insertProfesseur(Professeur Professeur) {
			rs.save(Professeur);
		}

}
