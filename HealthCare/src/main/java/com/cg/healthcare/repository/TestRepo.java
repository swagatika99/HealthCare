package com.cg.healthcare.repository;

import org.springframework.data.repository.CrudRepository;

import com.cg.healthcare.entity.Test;

public interface TestRepo extends CrudRepository<Test, Integer> {

}
