package com.lazylearn.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fill {
//This will be used for Fill the remaing things what we are given there


  	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Hello");
		list.add("Hi");
		list.add("Krishna");

		Collections.fill(list, "Gaganam Krishna");

		System.out.println(list);

		List<String> anotherList = new ArrayList<>();
		anotherList.add("Hello Test");
		anotherList.add("Hi Test");
		anotherList.add("Krishna Test");

		if (anotherList.contains("Hi Test")) {
			Collections.fill(anotherList, "Gaganam KRISHNA");
		}
		
		System.out.println(anotherList);

	}

}
