package com.SimplonOcto.API.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SimplonOcto.API.model.Teacher;
import com.SimplonOcto.API.model.TeacherRepository;

import lombok.Data;


@Data
@Service
public class TeacherService {

@Autowired
private TeacherRepository rs;
		
public Optional<Teacher> getTeacher(final Integer id) {
			return rs.findById(id);
		}
		
public Iterable<Teacher> getAllTeachers(){
			
			//List<Produit> produitsList = new ArrayList<>();
			//pr.findAll().forEach(product -> produitsList.add(product));;
			
			//return produitsList;
			return rs.findAll();
		}
		
		public void deleteTeacher(final Integer id) {
			rs.deleteById(id);
		}
		
		public void insertTeacher(Teacher Professeur) {
			rs.save(Professeur);
		}

}
