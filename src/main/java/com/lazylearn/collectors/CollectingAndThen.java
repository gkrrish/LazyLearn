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
		
		linkedList.stream().collect(Collectors.collectingAndThen(null, null));
		
		/*
		 *  public static<T,A,R,RR> Collector<T,A,RR> collectingAndThen(Collector<T,A,R> downstream,
                                                                Function<R,RR> finisher) {
		 */
		
		//actually why all these methods are returning Collectors?

	}

}
