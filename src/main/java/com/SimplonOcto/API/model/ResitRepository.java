package com.SimplonOcto.API.model;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResitRepository extends CrudRepository<Resit,Integer> {

	List<Resit> findByStatus(String status);
	List<Resit> findByTeacherName(String name);

}