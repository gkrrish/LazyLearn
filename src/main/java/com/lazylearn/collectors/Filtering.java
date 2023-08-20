package com.lazylearn.collectors;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Filtering {
	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<>();

		linkedList.add("Hello");
		linkedList.add("Hi");
		linkedList.add("Krishna");
		linkedList.add("How are you");
		linkedList.add("Hope! Doing Good");
		
		
		List<String> collect = linkedList.stream().collect(Collectors.filtering(e->e.contains("Krishna"), Collectors.toList()));
		
		System.out.println(collect);
		
		
		/*
		 * public static <T, A, R> Collector<T, ?, R> filtering(Predicate<? super T> predicate, Collector<? super T, A, R> downstream) {
		 */
		
		
		//Then what is the difference between stream().filter() vs Collectors.filtering(Predicate, Collector) technically both are doing same job right?
		/*Stream.filter():
			This method is a part of the Stream API itself. It's used to filter elements from a stream based on a given predicate. 
			The filtered elements are still part of the stream, and you can continue to perform operations on the filtered stream.
			
			
			List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

			List<Integer> evenNumbers = numbers.stream()
			    .filter(n -> n % 2 == 0)
			    .collect(Collectors.toList());

			System.out.println(evenNumbers); // Output: [2, 4]
			
			
			In this example, filter() retains the elements that satisfy the predicate and creates a new stream containing those elements.
			
			
			Collectors.filtering(Predicate, Collector):
				This method is part of the Collectors class. It's used within a collect operation to filter elements while collecting them into a new collection. 
				It's particularly useful when you want to apply a filtering operation as part of the collection process.

				Example:List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

						List<Integer> evenNumbers = numbers.stream()
    					.collect(Collectors.filtering(n -> n % 2 == 0, Collectors.toList()));
	
					System.out.println(evenNumbers); // Output: [2, 4]
					In this example, filtering() acts as a downstream collector within the collect() operation. 
					It applies the filter predicate to the elements while collecting them into a list.

					The key difference lies in the context of usage. If you simply want to filter elements from a stream and continue working with the filtered stream, 
					you would use Stream.filter(). On the other hand, if you want to collect elements into a new collection while applying a filter, you would use 
					Collectors.filtering() as part of the collect() operation.

					It's worth noting that Collectors.filtering() is a relatively new addition to Java (introduced in Java 9), 
					so if you're working in an environment with earlier versions of Java, you won't have access to this method.
	
	*/
	}

}
