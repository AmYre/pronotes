package com.SimplonOcto.API.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "overseer")
public class Overseer {
	
	@Getter
	@Setter
	@Id
	private Integer id;
	
	private String name;
	
	private String lastName;
	
	private String email;
	
	private String password;
	
}