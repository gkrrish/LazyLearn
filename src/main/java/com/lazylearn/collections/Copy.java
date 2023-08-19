package com.lazylearn.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Copy {

  	public static void main(String[] args) {
		// Copying content one collection to another collection, same collection type

		List<Integer> sourceList = new ArrayList<>();
		sourceList.add(1);
		sourceList.add(2);
		sourceList.add(3);

		List<Integer> destinationList = new ArrayList<>(sourceList.size()); // Preallocate space

		// Copy elements from sourceList to destinationList
		Collections.copy(destinationList, sourceList);

		System.out.println("Source List: " + sourceList);
		System.out.println("Destination List: " + destinationList);
		
		
		Set<Integer> set=new HashSet<>();
		set.add(4);
		set.add(5);
		set.add(6);
		
		
		//Collections.copy(sourceList, set);
		
		//This will give the compile time error, saying that the type is mistmatch, List to List and Set to Set not each other

		//and some how it looks like, addAll(). hope we can replacely use each other.
  	}
}
