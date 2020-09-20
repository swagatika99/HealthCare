package com.cg.healthcare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.healthcare.entity.User;
import com.cg.healthcare.service.UserService;

@RestController
@RequestMapping("/healthcare")
public class UserController {
	
	@Autowired
	UserService userservice;
	
	@GetMapping("/viewalluser")
	List<User> viewAllUser()
	{
		return userservice.viewAllUser();
		
	}
	
	@PostMapping("/adduser")
	String addUser(@RequestBody User user) {
		String status="User added succesfully";
		if (userservice.addUser(user)) {
			return status;
		}
		return "user not added";
		
		
	}
	@PostMapping("/edituser")
	String removeUser(@RequestBody User user ) {
		String status="User updated successfully";
		if(userservice.editUser(user))
		{
			return status;
		}
		return "user not updated";
		
	}
	@DeleteMapping("/delete user")
	String removeUser(@RequestParam Integer userid) {
		if(userservice.removeUser(userid)) {
			return "user deleted";
		}
		return "error";
	}
	
	
	
	
	

}
