package com.lazylearn.collectors;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapping {

	public static void main(String[] args) {

		LinkedList<PersonTest> linkedList = new LinkedList<>();
		linkedList.add(new PersonTest("AKrishna", Arrays.asList("Eating","Sleelping","Roaming")));
		linkedList.add(new PersonTest("BKrishna", Arrays.asList("Reading","Dancing","Singing")));
		linkedList.add(new PersonTest("CKrishna", Arrays.asList("Arguing","Commenting","Crying")));
		linkedList.add(new PersonTest("DKrishna", Arrays.asList("Eating","Sleelping","Roaming","end of Hobbies")));
		
		//Question : Display the all hobbies which are people have.
		
		Set<String> collect = linkedList.stream().collect(Collectors.flatMapping(personTest->personTest.getHobbies().stream().distinct(), Collectors.toSet()));
		
		System.out.println(collect);
		
		/*
		 * public static <T, U, A, R>Collector<T, ?, R> flatMapping(Function<? super T, ? extends Stream<? extends U>> mapper, Collector<? super U, A, R> downstream) {
		 */
		
		

	}

}

class PersonTest {
    private String name;
    private List<String> hobbies;

    public PersonTest(String name, List<String> hobbies) {
        this.name = name;
        this.hobbies = hobbies;
    }

    public List<String> getHobbies() {
        return hobbies;
    }
}
