package com.lazylearn.generics;

/**
 * @author Gaganam Krishna
 *
 */
public class Student {

	private int studentId;
	private String studentName;
	private String studentCityName;

	public Student(int studentId, String studentName, String studentCityName) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCityName = studentCityName;
	}
	
	public Student() {
	}

	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getStudentCityName() {
		return studentCityName;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setStudentCityName(String studentCityName) {
		this.studentCityName = studentCityName;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentCityName="
				+ studentCityName + "]";
	}

}
