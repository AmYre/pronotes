package com.SimplonOcto.API.model;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeRepository extends CrudRepository<Grade,Integer> {

	List<Resit> findByStudentName(String name);
	List<Grade> findAllByResitId(Optional <Integer> id);

}