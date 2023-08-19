package com.lazylearn.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class nCopies {

  	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		
		list.add("Hi");
		list.add("Hello");
		list.add("Krishna");
		
		List<String> nCopies = Collections.nCopies(2, "Hello");
		
		System.out.println(nCopies);
		
		//just we are trying to make /print no.of copies

	}
}
