package com.cg.healthcare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.healthcare.entity.Appointment;
import com.cg.healthcare.service.AppointmentService;

@RestController
@RequestMapping("/healthcare")
public class AppointmentController {
	
	@Autowired
	AppointmentService appservice;
	
	
	@PostMapping(value="/makeAppointment")
    public Appointment bookAppointment(@RequestBody Appointment appointment)
    {
		 return appservice.bookAppointment(appointment);
    }
	 @GetMapping(value="/viewAppointment/{usersid}")
     public List<Appointment> viewAppointment(@PathVariable("usersid") int usersid)
     {
    	 return appservice.viewAppointment(usersid);
     }
}
