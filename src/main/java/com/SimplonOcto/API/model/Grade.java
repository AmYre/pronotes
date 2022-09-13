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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "grade")
public class Grade implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;
	
	@ManyToOne
	@JoinColumn(name="studentId", referencedColumnName="id", insertable=false, updatable=false)
	public Student student;

	@ManyToOne
	@JoinColumn(name="resitId", referencedColumnName="id", insertable=false, updatable=false)
	public Resit resit;

	
	public Integer grade;
	
}