package com.SimplonOcto.API.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "commande")
public class Commande {
    @Id
    private int idcommande;
    
    private Date datecommande;
    
    @OneToOne
    @JoinColumn(name = "idclient")
    private Client idclient;
    
}