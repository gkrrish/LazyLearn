package com.lazylearn.collections;

import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample {
	public static void main(String[] args) {

		// here I am comparing the Emp object and Student objects based on the city and
		// sorting the elements based on the alphabetical order

		Student s1 = new Student("Krishna", 11, 11, 1000.0f, "Uppal");
		Employee e1 = new Employee("Krishna", 12, 12, 1200.0f, "Annojiguda");

		Comparable<Object> cityCompare = new CityCompareSort();
		int compareTo = cityCompare.compareTo(s1);

		System.out.println(compareTo);
		

	}

}

class CityCompareSort implements Comparable<Object> {

	@Override
	public int compareTo(Object o) {
		return -1;
	}

}

class CityCompareComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {// taking two objects, will check whether it is same or not. class cast
												// exception

		return 0;
	}

}
