package com.santhosh.restapi.day4.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentModel {
	@Id
	private int id;
	private String studentName;
	private String departmentName;
	private String mailid;
	public StudentModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentModel(int id, String studentName, String departmentName, String mailid) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.departmentName = departmentName;
		this.mailid = mailid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	
}