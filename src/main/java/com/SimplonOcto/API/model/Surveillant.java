package com.SimplonOcto.API.model;

import java.sql.Date;

import javax.persistence.Column;
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
	
	public Surveillant() {
		
	}
	
	public Surveillant(Integer id_surveillant, String prenom, String nom, String password) {
		this.id_surveillant = id_surveillant;
		this.prenom = prenom;
		this.nom = nom;
		this.password = password;
	}
	
	public Integer getId_surveillant () {return id_surveillant;}
	public String getPrenom () {return prenom;}
	public String getNom () {return nom;}
	public String getPassword () {return password;}
	public Integer setId_surveillant (Integer id_surveillant) { return this.id_surveillant = id_surveillant; }
	public String setPrenom (String prenom) { return this.prenom = prenom; }
	public String setNom (String nom) { return this.nom = nom; }
	public String setPassword (String password) { return this.password = password; }
	
}