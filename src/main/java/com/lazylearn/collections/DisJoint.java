package com.lazylearn.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DisJoint {

  	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("Hello");
		list.add("Krishna");
		list.add("Good morning");
		
		//Disjoint will checks the both contents at-least one same means gives true.
		
		List<String> another=new ArrayList<>();
		another.add("Krishna");
		another.add("Uppal");
		another.add("Hyderabad");
		
		
		boolean disjoint = Collections.disjoint(list, another);
		
		System.out.println(disjoint);//False
		
		//it prints the False because, both are have some common content, i.e: Krishna
		//if nothing matched means, we can print the True.
		
		List<String> test=Arrays.asList("My", "Name", "Is","Not Krishna");
		
		boolean disjoint2 = Collections.disjoint(list, test);
		System.out.println(disjoint2);
		

  	}
}
