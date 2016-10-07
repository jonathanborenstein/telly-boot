package com.telly.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="telly_bus")
public class Bus {
	

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull
	@Column(name="date")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date date;
	
	
	@Column(name="leavingfrom")
	private String leaveFrom;
	
	@Column(name="goingto")
	private String goingTo;
	
	
	public Bus() {
		
	}


	public Bus(Date date, String leaveFrom, String goingTo) {
		this.date = date;
		this.leaveFrom = leaveFrom;
		this.goingTo = goingTo;
	
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getLeaveFrom() {
		return leaveFrom;
	}


	public void setLeaveFrom(String leaveFrom) {
		this.leaveFrom = leaveFrom;
	}


	public String getGoingTo() {
		return goingTo;
	}


	public void setGoingTo(String goingTo) {
		this.goingTo = goingTo;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}
	
	
}