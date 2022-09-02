package com.SimplonOcto.API.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "classe")
public class Classe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_classe;
	
	private String nom;
	
	

}
