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
	
	public Rattrapage() {
		
	}
	
	public Rattrapage(Integer id_rattrapage, Date date_rattrapage, String libelle, String pdf_sujet) {
		this.id_rattrapage = id_rattrapage;
		this.date_rattrapage = date_rattrapage;
		this.libelle = libelle;
		this.pdf_sujet = pdf_sujet;
	}
	
	public Integer getId_rattrapage () {return id_rattrapage;}
	public Date getDate_rattrapage () {return date_rattrapage;}
	public String libelle () {return libelle;}
	public String pdf_sujet () {return pdf_sujet;}
	public Integer setId_rattrapage (Integer id_rattrapage) { return this.id_rattrapage = id_rattrapage; }
	public Date setDate_rattrapagee (Date date_rattrapage) { return this.date_rattrapage = date_rattrapage; }
	public String setLibelle (String libelle) { return this.libelle = libelle; }
	public String setPdf_sujet (String pdf_sujet) { return this.pdf_sujet = pdf_sujet; }
	
}