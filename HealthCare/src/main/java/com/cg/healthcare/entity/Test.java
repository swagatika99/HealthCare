package com.cg.healthcare.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Testclass")
public class Test {
	@Id
	private int testid;
	private String testname;
	private float testcost;
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Test(int testid, String testname, float testcost) {
		super();
		this.testid = testid;
		this.testname = testname;
		this.testcost = testcost;
	}
	public int getTestid() {
		return testid;
	}
	public void setTestid(int testid) {
		this.testid = testid;
	}
	public String getTestname() {
		return testname;
	}
	public void setTestname(String testname) {
		this.testname = testname;
	}
	public float getTestcost() {
		return testcost;
	}
	public void setTestcost(float testcost) {
		this.testcost = testcost;
	}
	
	
	
//	@ManyToOne
//	@JoinColumn(name="diagnosticCentreId")
//	private DiagnosticCenter diagnosticCentre;
	/*
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="centreid",referencedColumnName="centreid")
	private Diagnostic_center diagnostic_center;
	*/

//	public Test() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Test(int testid, String testname, float testcost, DiagnosticCenter diagnosticCentre) {
//		super();
//		this.testid = testid;
//		this.testname = testname;
//		this.testcost = testcost;
//		this.diagnosticCentre = diagnosticCentre;
//	}
//	public int getTestid() {
//		return testid;
//	}
//	public void setTestid(int testid) {
//		this.testid = testid;
//	}
//	public String getTestname() {
//		return testname;
//	}
//	public void setTestname(String testname) {
//		this.testname = testname;
//	}
//	public float getTestcost() {
//		return testcost;
//	}
//	public void setTestcost(float testcost) {
//		this.testcost = testcost;
//	}
//	public DiagnosticCenter getDiagnosticCentre() {
//		return diagnosticCentre;
//	}
//	public void setDiagnosticCentre(DiagnosticCenter diagnosticCentre) {
//		this.diagnosticCentre = diagnosticCentre;
//	}

		
}
