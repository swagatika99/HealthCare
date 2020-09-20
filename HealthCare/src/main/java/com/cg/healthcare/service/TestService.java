package com.cg.healthcare.service;

import com.cg.healthcare.entity.Test;

public interface TestService {
	boolean  addTest(Test test);
	boolean removeTest(Integer testid);
}
