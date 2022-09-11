package com.SimplonOcto.API.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "resit")
public class Resit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;
	
	public Date resitDate;
	
	public String name;
	
	public String exam;
	
	public String status;
	
	public Time duration;
	
	@ManyToOne
	@JoinColumn(name= "id", referencedColumnName="rattrapage_id", insertable=false, updatable=false)
	public Teacher teacher;
	
}