package com.lazylearn.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckedCollection {

  //this will checks the whether the Generic is correct /Type safetly or not
  //this was replace by Generics on recent changes


  
	//Its on OLDER mechanism, now we have GENERICS to solve type safety things.

	public static void main(String[] args) {

		List<String> originalList = new ArrayList<>();
		originalList.add("Hello");
		originalList.add("Krishna");
		
		List<String> checkedList = Collections.checkedList(originalList, String.class);
		
		//adding elements to checkedList, because it is String type
		checkedList.add("Good morning");
		
		//This will give compile time error
   //checkedList.add(123);
		
		System.out.println(originalList);

	}


}
