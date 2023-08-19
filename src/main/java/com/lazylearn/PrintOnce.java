package com.lazylearn;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintOnce {
	public static void main(String[] args) {
		
		List<Integer> input=Arrays.asList(1,1,1,2,3,3,3,3,4,5,5,5);
		
		   List<Integer> output = input.stream()
	                .collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()))
	                .entrySet().stream()
	                .flatMap(entry -> Collections.nCopies(Math.min(entry.getValue().intValue(), 2), entry.getKey()).stream())
	                .collect(Collectors.toList());
		
			
		   
		   output.stream().forEach(System.out::print);
		   
		   
		   Map<Integer, Integer> count=new HashMap<>();
		   
		   for (int value: input) {
			   int frequency = Collections.frequency(input, value);
			   count.put(value, frequency);
		}
		   
		   count.entrySet().stream().forEach(System.out::println);
		   
		   
		
	}

}
