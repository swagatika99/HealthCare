package com.cg.healthcare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.healthcare.entity.Appointment;
import com.cg.healthcare.repository.AppointmentRepo;
@Service
public class AppointmentServiceImpl implements AppointmentService {
@Autowired
AppointmentRepo appointmetRepo;

@Override
public Appointment bookAppointment(Appointment appointment) {
	
	return appointmetRepo.save(appointment); 
}

@Override
public List<Appointment> viewAppointment(int usersid) {
	// TODO Auto-generated method stub
	return appointmetRepo.findAllById(usersid) ;
}



}
