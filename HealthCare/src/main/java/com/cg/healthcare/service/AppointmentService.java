package com.cg.healthcare.service;

import java.util.List;

import com.cg.healthcare.entity.Appointment;

public interface AppointmentService {
	Appointment bookAppointment(Appointment appointment);
	List<Appointment> viewAppointment(int usersid);
}
