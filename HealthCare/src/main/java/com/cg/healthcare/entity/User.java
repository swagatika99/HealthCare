package com.cg.healthcare.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class User {
	@Id
	private int userid;
	private String name;
	private int age;
	private String gender;
	private long phonenumber;
	private String password;
	private String email;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userid, String name, int age, String gender, long phonenumber, String password, String email) {
		super();
		this.userid = userid;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phonenumber = phonenumber;
		this.password = password;
		this.email = email;
	}
	
//	@OneToOne(mappedBy="users")
//	private Appointment appointment;
//	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="userid",referencedColumnName = "appointmentid")
	private Appointment appointment;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Appointment getAppointment() {
		return appointment;
	}
	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}
	
	
	

}
