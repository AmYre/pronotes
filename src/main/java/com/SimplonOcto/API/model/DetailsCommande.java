package com.SimplonOcto.API.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "detailscommande")
public class DetailsCommande {
	
	@Id
	private int id;
	
	private String idproduit;
	
	private int idcommande;
    
	private int quantite;
	
}