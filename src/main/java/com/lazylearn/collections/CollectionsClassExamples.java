package com.lazylearn.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsClassExamples {

	public static void main(String[] args) {
		
		// EmptyList
		List<String> emptyList = Collections.EMPTY_LIST;
//		emptyList.add("Hello");//Immutable list because EMPTY_LIST, gets exception
//		System.out.println(emptyList);
		
		Map emptyMap = Collections.EMPTY_MAP;
//		System.out.println(emptyMap);
		
		Set emptySet = Collections.EMPTY_SET;
//		System.out.println(emptySet);
		
		
//		Collections.addAll(null, null);
		
		List<String> list1=new ArrayList<>();
		list1.add("X");
		List<String> testList=new ArrayList<>(Arrays.asList("A","B"));
		list1.addAll(list1.size(), testList); //here If we give the non index value then will get IOBException
		
//		list1.forEach(System.out::println);
		
		List<String> asList = Arrays.asList("Test Data");
		
//		list1.addAll(asList);
		String[] array1 = {"Apple", "Banana", "Cherry"};
		
		Collections.addAll(list1, array1);
		
//		list1.forEach(System.out::println);
		

//		Collections.checkedList(null, null); //this is we can achieve through generics
//		Collections.copy(null, null);//copying content from one collection to another collection, example : Cache
		
		List<String> fruitList=new ArrayList<>();
		fruitList.addAll(Arrays.asList("Apple","Bananna","Cherrys"));
		
		
		Collections.fill(fruitList, "Berrys");
		
//		fruitList.forEach(System.out::println);
		
		List<Integer> list11 = new ArrayList<>();
        list11.add(1);
        list11.add(2);
        list11.add(3);

        List<Integer> list22 = new ArrayList<>();
        list22.add(4);
        list22.add(5);
        list22.add(6);

        List<Integer> list33 = new ArrayList<>();
        list33.add(3);
        list33.add(6);
        list33.add(9);

        boolean areDisjoint1 = Collections.disjoint(list11, list22);
        boolean areDisjoint2 = Collections.disjoint(list11, list33);

//        System.out.println("Are list11 and list22 disjoint? " + areDisjoint1); // Output: true
//        System.out.println("Are list11 and list33 disjoint? " + areDisjoint2); // Output: false
    
        
//        Collections.unmodifiableList(null);//gives the Immutable List
        
//        Collections.enumeration(null);//replaced by forEach, it will be used for Iteration purpose only
        
        int frequency = Collections.frequency(list22, 4);
//        System.out.println(frequency);
        
//        subList.forEach(System.out::println);
        
        List<Integer> sourceList = new ArrayList<>();
        sourceList.add(1);
        sourceList.add(2);
        sourceList.add(3);
        sourceList.add(4);
        sourceList.add(5);
        
        List<Integer> subList = new ArrayList<>();
        subList.add(3);
        subList.add(4);
        
        int indexOfSubList = Collections.indexOfSubList(sourceList, subList);
        
        if (indexOfSubList != -1) {
//            System.out.println("Sub-list found at index: " + indexOfSubList);
        } else {
//            System.out.println("Sub-list not found.");
        }
        
        List<String> demoList=new ArrayList<>(10);
        List<String> nCopies = Collections.nCopies(10, "Hello, Krishna");
        
        
//        nCopies.forEach(System.out::println);
        Map<String, Boolean> map = new HashMap<>();
        Set<String> set = Collections.newSetFromMap(map);

        set.add("Apple");
        set.add("Banana");

//        System.out.println("Set: " + set);
//        System.out.println("Map: " + map);
//        set.add("Apple");
//        System.out.println("Set: " + set);
//        System.out.println("Map: " + map); //it will be synch between set and map scenario it will helpful
        
        demoList.add("Gaganam");
        demoList.add("Krishna");
        demoList.add("River Krishna");
        demoList.add("Rivar Godavari");
        
        
        Collections.shuffle(demoList);
//        demoList.forEach(System.out::println);// like non-synchronous manner it will print
        Collections.sort(demoList);
       Collections.reverseOrder();
       
//       demoList.forEach(System.out::println);
//       System.out.println("--------------------");
       Collections.sort(demoList, Collections.reverseOrder());
//       demoList.forEach(System.out::println);
       
//===================These are the basic methods of Collections Class ========Used for utilization methods purpose
       
       

	}

}
