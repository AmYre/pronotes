package com.SimplonOcto.API.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OverseerRepository extends CrudRepository<Overseer,Integer> {

}