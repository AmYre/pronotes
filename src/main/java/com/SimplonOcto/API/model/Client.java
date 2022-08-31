package com.SimplonOcto.API.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "client")
public class Client {
	
	@Id
	private String idclient;
	
	private String nom;
	
	private String prenom;
	
	private String ville;
}