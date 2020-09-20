package com.cg.healthcare.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.healthcare.entity.User;
import com.cg.healthcare.repository.UserRepo;
@Service
public class UserServiceImpl implements UserService {
@Autowired
UserRepo userRepo;
	@Override
	public List<User> viewAllUser() {
		
		return (List<User>) userRepo.findAll();
	}

	@Override
	public boolean addUser(User user) {
		userRepo.save(user);
		return true;
	}

	@Override
	public boolean removeUser(Integer userid) {
		userRepo.deleteById(userid);
		return true;
	}

	@Override
	public boolean editUser(User user) {
	Optional<User> find=userRepo.findById(user.getUserid());
	if(find.isPresent()) {
		userRepo.save(user);
		return true;
	}

		return false;
	}
}