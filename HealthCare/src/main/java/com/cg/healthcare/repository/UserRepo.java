package com.cg.healthcare.repository;

import org.springframework.data.repository.CrudRepository;


import com.cg.healthcare.entity.User;

public interface UserRepo extends CrudRepository<User, Integer> {

}
