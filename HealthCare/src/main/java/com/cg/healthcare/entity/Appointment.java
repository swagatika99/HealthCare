package com.cg.healthcare.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Appointment")
public class Appointment {
	@Id
	//@GeneratedValue
	private int appointmentId;
	//private String appointmentstatus;
	private Date datetime;
	private int centrenum;
	private String testnames;
	private int usersid;
	
	
//	@ManyToOne(cascade=CascadeType.ALL)
//@JoinColumn(name="appointmentId",referencedColumnName = "centreid")
//private DiagnosticCenter diagnosticCentre;
//	
	
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}


public Appointment(int appointmentId, Date datetime, int centrenum, String testnames, int usersid) {
	super();
	this.appointmentId = appointmentId;
	this.datetime = datetime;
	this.centrenum = centrenum;
	this.testnames = testnames;
	this.usersid = usersid;
}


public int getAppointmentId() {
	return appointmentId;
}


public void setAppointmentId(int appointmentId) {
	this.appointmentId = appointmentId;
}


public Date getDatetime() {
	return datetime;
}


public void setDatetime(Date datetime) {
	this.datetime = datetime;
}


public int getCentrenum() {
	return centrenum;
}


public void setCentrenum(int centrenum) {
	this.centrenum = centrenum;
}


public String getTestnames() {
	return testnames;
}


public void setTestnames(String testnames) {
	this.testnames = testnames;
}


public int getUsersid() {
	return usersid;
}


public void setUsersid(int usersid) {
	this.usersid = usersid;
}



		
	
}
