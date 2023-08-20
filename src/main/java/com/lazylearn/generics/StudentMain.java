package com.lazylearn.generics;

import com.lazylearn.collections.Employee;

public class StudentMain {

	public static void main(String[] args) {
		
		StudentService<Student> studentService=new StudentService<>();
		
		Student one=new Student();
		one.setStudentId(1);
		one.setStudentName("Krishna");
		one.setStudentCityName("Hyderbad");
		
		int studentIndex = studentService.studentIndex(one);
		String studentIndexString2 = studentService.studentIndexString(new Employee("Krishna", 10, 11, 100, "Hyderabad"));
		
		System.out.println(studentIndex);
		
		System.out.println(studentIndexString2);
		
		
		String studentIndexString = StudentService.studentIndexString(new Employee("Krishna", 10, 11, 100, "Hyderabad"));
		System.out.println(studentIndexString);
		
		
		/*
		 * ===============================NOTE==========================================
		 * If you observe the Static method carefully, we can access the static method throgh object (studentService) or 
		 * directly through StudentSerive Class, because it has the flexibility
		 * 
		 *  But, in the case of instance methods we dont have that flexibility. so Generics works OBJECT level i.e studentSerive object
		 *  In case of 
		 *  
		 *  Static method, it is INDEPENDENT TO ITSELF ,
		 *  
		 *  so whenever you are creating the Static method level Generics we have to give the static<T> becuase, it removes lot of
		 *  complexities and confusion.
		 *  
		 *  
		 *  whichever you are giving the generics to the method level, same way thing we need to give /Indicate beside static beside
		 * 
		 * 
		 */

	}

}
