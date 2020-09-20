package com.cg.healthcare.service;

import java.util.List;

import com.cg.healthcare.entity.User;

public interface UserService {
	List<User> viewAllUser();
	boolean addUser(User user);
	boolean removeUser(Integer userid);
	boolean editUser(User user);
	
}
