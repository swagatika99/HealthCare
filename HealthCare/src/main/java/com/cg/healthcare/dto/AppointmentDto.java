package com.cg.healthcare.dto;

public class AppointmentDto {
private String  appointmentstatus;

public AppointmentDto() {
	super();
	// TODO Auto-generated constructor stub
}

public AppointmentDto(String appointmentstatus) {
	super();
	this.appointmentstatus = appointmentstatus;
}

public String getAppointmentstatus() {
	return appointmentstatus;
}

public void setAppointmentstatus(String appointmentstatus) {
	this.appointmentstatus = appointmentstatus;
}

}
