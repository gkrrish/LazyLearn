package com.lazylearn.collectors;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class CollectingAndThen {

	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("HelloKrishna");
		linkedList.add("HiKrishna");
		linkedList.add("ByeKrishna");
		linkedList.add("ThanksKrishna");
		
		String collect = linkedList.stream().collect(Collectors.collectingAndThen(Collectors.toList(), e->"say Hello"));
		
//		System.out.println(collect);
		
		
		 String collect2 = linkedList.stream().collect(Collectors.collectingAndThen(Collectors.toList(), e->e.get(0)));
//		 System.out.println(collect2);
		
		 Integer collect3 = linkedList.stream().collect(Collectors.collectingAndThen(Collectors.toList(), e->e.size()));
//		 System.out.println(collect3);
		
		 
		 LinkedList<Integer> linkedListForInt=new LinkedList<>();
		 linkedListForInt.add(10);
		 linkedListForInt.add(20);
		 linkedListForInt.add(30);
		 linkedListForInt.add(40);
		 linkedListForInt.add(50);
		 
		Integer collect4 = linkedListForInt.stream().collect(Collectors.collectingAndThen(Collectors.summingInt(Integer::intValue), e->e));
		 
		System.out.println(collect4);
		
		//so finally CollectingAndThen is doing two operations, primary work and top of that another work is doing
		
		
		
		
		
		
		/*
		 *  public static<T,A,R,RR> Collector<T,A,RR> collectingAndThen(Collector<T,A,R> downstream,Function<R,RR> finisher) {
		 *  
		 *  															lamda Implementation          Lamda Implementation
		 *  
		 *  here, both Collector and Function are Functional Interfaces only, so here we need to send the implementaion of the method through Lamdas.
		 *  Collector has Implementation of Collectors right, thats why I said this is also seems like functional interface only.
		 */
		
		//actually why all these methods are returning Collectors?
		
		/*
		 * What is the significance of Collector (Interface)
		 * 
		 * In real applications, Collector interface implementations and the utility methods in the Collectors class are used extensively when working with Java Streams. 
		For example, you might use them to process and manipulate large datasets, 
		perform filtering and mapping operations, and then collect the results in a desired format or structure.
		
		
		Indirectly *Collectors* class has been implemented the Collector (I )interface methods.
		
		Generally people will follow the strategy design pattern, whenever the method called Collect(Collector<T>); here actually collect method can take Collections class also,
		
		for the sake of progamming flexibilty Collector (I) was taken. 
		
		so dont worry about the Collector (I) we used internally with Collectors class.
		
		*/

	}

}
