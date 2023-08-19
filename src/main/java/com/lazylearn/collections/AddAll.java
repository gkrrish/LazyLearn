package com.lazylearn.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddAll {

  public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Hello");
		list.add("Good morning");
		list.add("Krishna");

		List<String> anotherList = Arrays.asList("Another Hello", "Another Good Morning", "Another Krishna");
		// Arrays.asList will be converts given Arrays to list

		// public static <T> boolean addAll(Collection<? super T> c, T... elements)

		Collections.addAll(list, "anotherHello");
		//here we can add only individual elements like T...elements

		list.forEach(System.out::println);

		System.out.println("------------------------------");
		// same thing we can do with List also
		list.addAll(anotherList);

		list.forEach(System.out::println);


    //Compiled on 16/08/2023
	}

}
