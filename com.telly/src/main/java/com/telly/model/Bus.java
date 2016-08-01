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

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="telly_bus")
public class Bus {
	

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
	@Column(name="dateleave")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date dateLeave;
	
	
	@Column(name="datereturn")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date dateReturn;
	
	@Column(name="leavingfrom")
	private String leaveFrom;
	
	@Column(name="goingto")
	private String goingTo;
	
	
	public Bus() {
		
	}


	public Bus(Date dateLeave, Date dateReturn, String leaveFrom, String goingTo) {
		this.dateLeave = dateLeave;
		this.dateReturn = dateReturn;
		this.leaveFrom = leaveFrom;
		this.goingTo = goingTo;
	
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Date getDateLeave() {
		return dateLeave;
	}


	public void setDateLeave(Date dateLeave) {
		this.dateLeave = dateLeave;
	}


	public Date getDateReturn() {
		return dateReturn;
	}


	public void setDateReturn(Date dateReturn) {
		this.dateReturn = dateReturn;
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
	
	
}