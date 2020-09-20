package com.cg.healthcare.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.cg.healthcare.entity.Appointment;

public interface AppointmentRepo extends CrudRepository<Appointment, Integer> {
	@Query("select a from Appointment a where a.usersid=?1")
	List<Appointment> findAllById(int usersid);
	@Query("select a from Appointment a")
	List<Appointment> viewAppointment2();
}
