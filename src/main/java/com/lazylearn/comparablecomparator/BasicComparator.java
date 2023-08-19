package com.lazylearn.comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BasicComparator {

	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<>();
		people.add(new Person("Alice", 30));
		people.add(new Person("Bob", 25));
		people.add(new Person("Charlie", 28));
		
		PersonComparator nameComparator = new PersonComparator();
		Collections.sort(people, nameComparator);
		
		//Collections.sort --> util method to call the sort things, whichever implementation we do
		
		people.forEach(System.out::println);
		
		System.out.println("=================================For another testing example by using Comparable mechanism by age=============");
		
		Collections.sort(people); // Uses natural ordering (compareTo in Person)
		
		people.forEach(System.out::println);
	}

}
