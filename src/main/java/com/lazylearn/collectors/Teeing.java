package com.lazylearn.collectors;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class Teeing {

	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<>();

		linkedList.add("Hello");
		linkedList.add("Hi");
		linkedList.add("Krishna");
		linkedList.add("How are you");
		
		
		linkedList.stream().collect(Collectors.teeing(null, null, null)E)

	}

}
