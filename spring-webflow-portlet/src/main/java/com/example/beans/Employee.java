package com.example.beans;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;


@Component
public class Employee implements Comparable<Employee>,Serializable {
	
	
	@NotNull
	private Long empId=0L;
	
	@NotNull
	@NotEmpty
	@Pattern(regexp="[\\p{IsAlphabetic}\\s]*" ,message="{Pattern.empname}")
	private String empName;
	
	public Child getChild() {
		return child;
	}

	public void setChild(Child child) {
		this.child = child;
	}

	@NotNull
	@NotEmpty
	@Pattern(regexp="[\\p{IsAlphabetic}\\s]*")
	private String grade;
	
	private Child child;

	public Long getEmpId() {
		return empId;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public int hashCode() {
		
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empId == null) ? 0 : (int) (empId ^ (empId >>> 32)));
		
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + ((grade == null) ? 0 : grade.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (grade == null) {
			if (other.grade != null)
				return false;
		} else if (!grade.equals(other.grade))
			return false;
		return true;
	}

	public Employee(Long empId, String empName,String grade) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}

	@Override
	public int compareTo(Employee o) {

		return (int) (this.getEmpId() - o.getEmpId());

	}

}
