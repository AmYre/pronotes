package com.SimplonOcto.API.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "surveillant")
public class Surveillant {
	
	@Id
	private Integer id_surveillant;
	
	private String prenom;
	
	private String nom;
	
	private String email;
	
	private String password;
	
}