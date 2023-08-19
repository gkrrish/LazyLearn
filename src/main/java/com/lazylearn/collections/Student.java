package com.lazylearn.collections;

import java.util.Objects;

public class Student {

	private String studentName;
	private int studentAge;
	private int studentId;
	private float studentFee;

	private String studentCity;

	public Student() {
	}

	public Student(String studentName, int studentAge, int studentId, float studentFee, String empCity) {
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentId = studentId;
		this.studentFee = studentFee;
		this.studentCity = empCity;
	}

	public String getStudentName() {
		return studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public int getStudentId() {
		return studentId;
	}

	public float getStudentFee() {
		return studentFee;
	}

	public String getEmpCity() {
		return studentCity;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setStudentFee(float studentFee) {
		this.studentFee = studentFee;
	}

	public void setEmpCity(String empCity) {
		this.studentCity = empCity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentCity, studentAge, studentFee, studentId, studentName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(studentCity, other.studentCity) && studentAge == other.studentAge
				&& Float.floatToIntBits(studentFee) == Float.floatToIntBits(other.studentFee)
				&& studentId == other.studentId && Objects.equals(studentName, other.studentName);
	}

}
