package com.userservice1.userservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class User {
	
	@Id
	private int dept_id;
	private int emp_id;
	private String emp_name;
	private  String role;
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public User(int dept_id, int emp_id,String emp_name, String role) {
		super();
		this.dept_id = dept_id;
		this.emp_id=emp_id;
		this.emp_name = emp_name;
		this.role = role;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	}