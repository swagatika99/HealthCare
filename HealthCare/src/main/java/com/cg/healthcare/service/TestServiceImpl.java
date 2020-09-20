package com.cg.healthcare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.healthcare.entity.Test;
import com.cg.healthcare.repository.TestRepo;
@Service
public class TestServiceImpl implements TestService {
@Autowired
TestRepo testrepo;
	@Override
	public boolean addTest(Test test) {
		testrepo.save(test);
		return true;
	}
	@Override
	public boolean removeTest(Integer testid) {
		testrepo.deleteById(testid);
		return true;
	}

	

}
