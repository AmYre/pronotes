package com.SimplonOcto.API.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SimplonOcto.API.model.Student;
import com.SimplonOcto.API.model.StudentRepository;

import lombok.Data;

@Data
@Service
public class StudentService {

	@Autowired
	private StudentRepository etr;
	
	public Iterable<Student> getAllStudents(){
		return etr.findAll();
	}
	
	public Optional<Student> getStudent(final Integer id){
		return etr.findById(id);
	}
	
	public void deleteStudent(final Integer id) {
		etr.deleteById(id);
	}
	
	public void insertStudent(Student etudiant) {
		etr.save(etudiant);
	}
	
}
