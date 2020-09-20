package com.cg.healthcare.service;

import com.cg.healthcare.entity.DiagnosticCenter;

public interface DiagnosticCenterService {
	boolean addCenter(DiagnosticCenter center);
	boolean removeCenter(Integer centreid);
}
