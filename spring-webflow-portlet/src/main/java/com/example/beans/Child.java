package com.example.beans;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Child  implements Serializable{
	
	private long childId;
	
	private String name;
	
	private int age;
	
	private String gender;
	
	private Employee emp;

	public long getChildId() {
		return childId;
	}

	public void setChildId(long childId) {
		this.childId = childId;
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

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public Child() {
		// TODO Auto-generated constructor stub
	}

	public Child(long childId, String name, int age, String gender, Employee emp) {
		super();
		this.childId = childId;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.emp = emp;
	}
   
	
}
