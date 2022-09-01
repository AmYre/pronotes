package com.SimplonOcto.API.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "professeur")
public class Professeur {
	
	@Id
	private Integer id_professeur;
	
	private String nom;
	
	private String prenom;
	
	private String email;
	
	private String password;
	
	private Integer id_rattrapage;

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getId_rattrapage() {
		return id_rattrapage;
	}

	public void setId_rattrapage(Integer id_rattrapage) {
		this.id_rattrapage = id_rattrapage;
	}
	
	
	
}
	