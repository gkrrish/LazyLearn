package com.lazylearn.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmptyList {
  //this will create or makes empty List, for Immutable use. in some cases it will be useful


  	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		
		list.add("Hello");
		list.add("Krishna");
		
		System.out.println(list);//currently this list has the elements and we can modify or add
		
		
		List<String> emptyList = Collections.emptyList();
		
		list=emptyList;
		
		System.out.println(emptyList);
		System.out.println(list);
		
		
		//By the way, we should use this way. generally we do
		List<Object> emptyList2 = Collections.emptyList();
		System.out.println(emptyList2);
		
		//like this way we can use the emptylist
	}

}
