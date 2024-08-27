package com.deparment.college;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "studentdetails")
public class StudModel {
	
	@Id
	@GeneratedValue
	int sno;
	String name;
	String email;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}