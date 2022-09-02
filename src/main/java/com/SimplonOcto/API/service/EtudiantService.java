package com.SimplonOcto.API.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SimplonOcto.API.model.EtudiantRepository;
import com.SimplonOcto.API.model.Etudiant;

import lombok.Data;

@Data
@Service
public class EtudiantService {

	@Autowired
	private EtudiantRepository etr;
	
	public Iterable<Etudiant> getAllEtudiant(){
		return etr.findAll();
	}
	
	public Optional<Etudiant> getEtudiant(final Integer id){
		return etr.findById(id);
	}
	
	public void deleteEtudiant(final Integer id) {
		etr.deleteById(id);
	}
	
	public void insertEtudiant(Etudiant etudiant) {
		etr.save(etudiant);
	}
	
}
