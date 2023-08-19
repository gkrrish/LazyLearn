package com.lazylearn.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {


  	public static void main(String[] args) {

		List<String> demoList = new ArrayList<>();

		demoList.add("Gaganam");
		demoList.add("Krishna");
		demoList.add("River Krishna");
		demoList.add("Rivar Godavari");

		Collections.sort(demoList);
		
		System.out.println(demoList);
		
		//we have another sorting mechanism also, like we can give the own sorting implementation class
		
		//    public static <T> void sort(List<T> list, Comparator<? super T> c)
		
		
	}

}
