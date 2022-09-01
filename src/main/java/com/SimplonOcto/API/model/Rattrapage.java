package com.SimplonOcto.API.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "rattrapage")
public class Rattrapage {
	
	@Id
	private Integer id_rattrapage;
	
	private Date date_rattrapage;
	
	private String libelle;
	
	private String pdf_sujet;
	
}