package com.SimplonOcto.API.model;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RattrapageRepository extends CrudRepository<Rattrapage,Integer> {

	List<Rattrapage> findByStatus(String status);

}