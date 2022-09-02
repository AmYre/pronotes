package com.SimplonOcto.API.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "etudiant")
public class Etudiant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_etudiant;
	
	private String nom;
	
	private String prenom;
	
	private String photo;
	
	private Integer id_classe;
}
