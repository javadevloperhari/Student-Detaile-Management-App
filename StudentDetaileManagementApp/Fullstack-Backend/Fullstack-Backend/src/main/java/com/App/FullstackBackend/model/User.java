package com.App.FullstackBackend.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity     //Automatically Generate Class Named(User) MYSQL Database
public class User {
	@Id
	@GeneratedValue
	private long id;
	private String studentname;
	private String fathertname;
	private float percentage;
	private long mobileno;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getFathertname() {
		return fathertname;
	}
	public void setFathertname(String fathertname) {
		this.fathertname = fathertname;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	
	

}
