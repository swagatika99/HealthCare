package com.cg.healthcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.healthcare.entity.Test;
import com.cg.healthcare.service.TestService;

@RestController
@RequestMapping("/healthcare")
public class TestController {
@Autowired
TestService testservice;

@PostMapping("/addtest")
String addTest(@RequestBody Test test) {
	String status="test added";
	if(testservice.addTest(test))
	{
		return status;
	}
	return "test not added";
	
}
@DeleteMapping("/removetest")
String removeTest(@RequestParam Integer testid) {
	if(testservice.removeTest(testid)) {
		return "test removed";
	}
	return "error";
}
}
