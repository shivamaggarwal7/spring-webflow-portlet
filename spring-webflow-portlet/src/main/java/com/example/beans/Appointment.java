package com.example.beans;

import java.io.Serializable;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Appointment implements Serializable {

	private long appointmentId;

	private Employee emp;
	
	private String empName;

	private Child child;
	
	private String childName;

	private String hospName;

	private Date date;
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getChildName() {
		return childName;
	}

	public void setChildName(String childName) {
		this.childName = childName;
	}

	public long getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(long appointmentId) {
		this.appointmentId = appointmentId;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
		this.empName=emp.getEmpName();
	}

	public Child getChild() {
		return child;
	}

	public void setChild(Child child) {
		this.child = child;
		this.childName=child.getName();
	}

	public String getHospName() {
		return hospName;
	}

	public void setHospName(String hospName) {
		this.hospName = hospName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Appointment(long appointmentId, Employee emp, Child child, String hospName, Date date) {
		super();
		this.appointmentId = appointmentId;
		this.emp = emp;
		this.child = child;
		this.hospName = hospName;
		this.date = date;
	}

	public Appointment() {
		// TODO Auto-generated constructor stub
	}

}
