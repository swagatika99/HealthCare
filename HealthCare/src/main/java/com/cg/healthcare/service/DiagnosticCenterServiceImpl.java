package com.cg.healthcare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.healthcare.entity.DiagnosticCenter;
import com.cg.healthcare.repository.DiagnosisCenterRepo;
@Service
public class DiagnosticCenterServiceImpl implements DiagnosticCenterService {
@Autowired
DiagnosisCenterRepo diagnosisCenter;
	@Override
	public boolean addCenter(DiagnosticCenter center) {
		diagnosisCenter.save(center);
		return true;
	}
	@Override
	public boolean removeCenter(Integer centreid) {
	diagnosisCenter.deleteById(centreid);
		return true;
	}

	

}
