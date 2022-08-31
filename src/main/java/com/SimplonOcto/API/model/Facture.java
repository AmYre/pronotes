package com.SimplonOcto.API.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "facture")
public class Facture {
	
	@Id
	private String idfacture;
	
	private String numero;
	
	private double montant;
	
	private Date date;
}