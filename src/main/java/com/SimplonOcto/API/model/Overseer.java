package com.SimplonOcto.API.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "overseer")
public class Overseer {
	
	@Id
	private Integer id;
	
	private String name;
	
	private String lastName;
	
	private String email;
	
	private String password;
	
}