package com.SimplonOcto.API.model;

import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "resit")
public class Resit implements Serializable {

	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;

	public Timestamp resitDate;

	public String name;

	public String exam;

	public String status;

	public Time duration;

	@Column(name = "teacher_id", nullable=false)
	private int teacher_id;
	@ManyToOne(optional=false)
	@JoinColumn(name = "teacher_id", insertable=false, updatable=false)
	private Teacher teacher;

	@Column(name = "overseer_id", nullable=false)
	private int overseer_id;
	@ManyToOne(optional=false)
	@JoinColumn(name = "overseer_id", insertable=false, updatable=false)
	private Overseer overseer;

}