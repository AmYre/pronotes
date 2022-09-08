package com.SimplonOcto.API.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SimplonOcto.API.model.ClassroomRepository;
import com.SimplonOcto.API.model.Classroom;
import com.SimplonOcto.API.model.ClassroomRepository;

import lombok.Data;

@Data
@Service
public class ClassroomService {

	@Autowired
	private ClassroomRepository clrepo;
	
	public Iterable<Classroom> getAllClassrooms(){
		return clrepo.findAll();
	}
	
	public Optional<Classroom> getClassroom(final Integer id){
		return clrepo.findById(id);
	}
	
	public void deleteClasse(final Integer id) {
		clrepo.deleteById(id);
	}
	
	public void insertClassroom(Classroom classe) {
		clrepo.save(classe);
	}
	
}
