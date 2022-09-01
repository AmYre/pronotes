package com.SimplonOcto.API.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveillantRepository extends CrudRepository<Surveillant,Integer> {

}