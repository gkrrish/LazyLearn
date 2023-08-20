package com.lazylearn.collectors;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class Counting {
	public static void main(String[] args) {
		
		LinkedList<String> linkedList=new LinkedList<>();
		linkedList.add("HelloTest");
		linkedList.add("HelloThere");
		linkedList.add("HelloKrishna");
		linkedList.add("HelloHi");
		
		Long counting = linkedList.stream().collect(Collectors.counting());// it counts the how many elements are there in collection
		
		System.out.println(counting);
		
	}

}
