package com.lazylearn.comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BasicComparable {

	public static void main(String[] args) {

		List<Person> people = new ArrayList<>();
		people.add(new Person("Alice", 30));
		people.add(new Person("Bob", 25));
		people.add(new Person("Charlie", 28));
		
		
		//if we do whatever implementaions. we need to call the Collections.sort method for result
		
		Collections.sort(people);
		
		people.forEach(System.out::println);
		
	}

}
