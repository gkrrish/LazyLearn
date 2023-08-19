package com.lazylearn.comparablecomparator;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
	//NOTE :: In real applications you should not create the Comparable and Compartor for same class
	//it will gives you lot of confusion

}
