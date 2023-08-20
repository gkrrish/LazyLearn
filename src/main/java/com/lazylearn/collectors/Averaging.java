package com.lazylearn.collectors;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Averaging {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("Hello");
		list.add("Hello");

		Double collect = list.stream().collect(Collectors.averagingDouble(e -> e.length()));//based on length only we are doing averaging
		//if we want we can do different type of averages also, lets try below
		
		Double hashCodeCollect = list.stream().collect(Collectors.averagingDouble(e -> e.hashCode()));//here doing average based on the hashcode
		
		System.out.println("hashCodeCollect : "+hashCodeCollect);
		
		
//		Double collect = list.stream().collect(Collectors.averagingDouble(String::length));//method reference also a lamda expression implementation
//		Double collect = list.stream().collect(Collectors.averagingDouble(e -> 20));//just here brute forcing as 20, so final intention is returning whatever we want.

		System.out.println(collect);
		
		
		List<Integer> intList=new ArrayList<>();
		intList.add(10);
		intList.add(20);
		intList.add(30);
		intList.add(40);
		
		Double intAverage = intList.stream().collect(Collectors.averagingInt(Integer::intValue));//based on values avaraging, in above string case, based on string length averaging
		
		System.out.println("intAverage : "+intAverage);
		

		LinkedList<Long> longList=new LinkedList<>();
		longList.add(10L);
		longList.add(20L);
		longList.add(30L);
		longList.add(40L);
		
		Double longAverage = longList.stream().collect(Collectors.averagingLong(Long::longValue));
		
		System.out.println("longAverage :"+longAverage);
		
	}

}
