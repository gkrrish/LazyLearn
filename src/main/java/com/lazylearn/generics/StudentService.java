package com.lazylearn.generics;

public class StudentService<T> {

	public int studentIndex(T t) {
		return 1;
	}

	public static<T> String studentIndexString(T t) {
		return "A";
	}
	
	/*
	  public static String studentIndexString(T t) {
		return "A";
	   }
	  
	  Cannot make a static reference to the non-static type T
	 */
	
	/*public static "<T>" ; here why <T> needed here beside static?
    --------------------------------------------------------------

		The <T> in public static "<T>" is a generic type parameter. It is used to indicate that the method can be called with objects of any type. The T can be replaced with any valid Java type, such as String, Integer, or List.

		In this case, the <T> is needed because the method is static. Static methods are shared by all objects of the class, regardless of their type. This means that the method can be called with objects of any type.

		If the <T> were not present, the method could only be called with objects of the same type as the class. This would be very restrictive and would limit the usefulness of the method.

		Here is an example of how the <T> can be used:

		public static <T> void printArray(T[] array) {
    		for (T element : array) {
        		System.out.println(element);
    			}
		}
		The printArray() method takes an array of objects as an argument. The <T> type parameter indicates that the array can contain objects of any type.

		The method can be called as follows:

		printArray(new String[]{"Hello", "World"});
		printArray(new Integer[]{1, 2, 3});
		In the first call, the <T> is replaced with String, so the method is called with an array of strings. In the second call, the <T> is replaced with Integer, so the method is called with an array of integers.

		The <T> type parameter makes the printArray() method more versatile and reusable. It can be called with arrays of any type, which makes it a more useful tool.
*/
	
	
	
	
	
	
	
	
	
}
