package com.cg.healthcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.healthcare.entity.DiagnosticCenter;
import com.cg.healthcare.service.DiagnosticCenterService;

@RestController
@RequestMapping("/healthcare")
public class DiagnosticCenterController {
@Autowired
DiagnosticCenterService dgnservice;

@PostMapping("/addcenter")
String addCenter(@RequestBody  DiagnosticCenter center) {
	String status="center added";
	if(dgnservice.addCenter(center)) {
		return status;
	}
	return "center not added";
}
@DeleteMapping("/removecenter")
String removeCenter( @RequestParam Integer centreid)
{
	if(dgnservice.removeCenter(centreid))
	{
		return "center removed";
	}
	return "error";
}
}
