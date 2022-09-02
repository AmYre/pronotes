package com.SimplonOcto.API.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SimplonOcto.API.model.ClasseRepository;
import com.SimplonOcto.API.model.Classe;

import lombok.Data;

@Data
@Service
public class ClasseService {

	@Autowired
	private ClasseRepository clrepo;
	
	public Iterable<Classe> getAllClasse(){
		return clrepo.findAll();
	}
	
	public Optional<Classe> getClasse(final Integer id){
		return clrepo.findById(id);
	}
	
	public void deleteClasse(final Integer id) {
		clrepo.deleteById(id);
	}
	
	public void insertClasse(Classe classe) {
		clrepo.save(classe);
	}
	
}
