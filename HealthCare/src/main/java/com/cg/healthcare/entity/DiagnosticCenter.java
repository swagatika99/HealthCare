package com.cg.healthcare.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//import antlr.collections.List;

@Entity
@Table(name="Diagnostic_center")
public class DiagnosticCenter {
	@Id
	private int centreid;
	private String centrename;
	private long centrePhno;
	private String centreAddress;
	
//	@OneToMany(targetEntity=Test.class,cascade=CascadeType.ALL)
//	@JoinColumn(name="centre_fk",referencedColumnName = "centreid")
//	private List<Test> test;
	/*
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="centreid",referencedColumnName="centreid")
	*/
//	private List<Test> test= new ArrayList<Test>();
//	
//	
//	public List getTest() {
//		return test;
//	}
//	public void setTest(List<Test> test) {
//		this.test = test;
//	}
	
	
	public DiagnosticCenter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DiagnosticCenter(int centreid, String centrename, long centrePhno, String centreAddress) {
		super();
		this.centreid = centreid;
		this.centrename = centrename;
		this.centrePhno = centrePhno;
		this.centreAddress = centreAddress;
	}
	public int getCentreid() {
		return centreid;
	}
	public void setCentreid(int centreid) {
		this.centreid = centreid;
	}
	public String getCentrename() {
		return centrename;
	}
	public void setCentrename(String centrename) {
		this.centrename = centrename;
	}
	public long getCentrePhno() {
		return centrePhno;
	}
	public void setCentrePhno(long centrePhno) {
		this.centrePhno = centrePhno;
	}
	public String getCentreAddress() {
		return centreAddress;
	}
	public void setCentreAddress(String centreAddress) {
		this.centreAddress = centreAddress;
	}
	
	
	
	
}
