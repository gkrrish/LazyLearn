package com.lazylearn.collections;

import java.util.Objects;

public class Employee {

	private int empId;
	private String empName;
	private int empAge;
	private float empSalary;

	private String empCity;


	public Employee(String empName, int empAge, int empId, float empSalary, String empCity) {
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
		this.empCity = empCity;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empAge, empCity, empId, empName, empSalary);
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
		return empAge == other.empAge && Objects.equals(empCity, other.empCity) && empId == other.empId
				&& Objects.equals(empName, other.empName)
				&& Float.floatToIntBits(empSalary) == Float.floatToIntBits(other.empSalary);
	}

}
