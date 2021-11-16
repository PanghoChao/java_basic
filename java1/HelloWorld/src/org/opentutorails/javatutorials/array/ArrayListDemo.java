package org.opentutorails.javatutorials.array;
import java.util.*; 
import java.util.stream.*; 

public class ArrayListDemo {
	public static int[] remove_Element(int[] myArray, int index) { 
		if (myArray == null || index <0 || index>= myArray.length) { 
			System.out.println("non-existing index"); 
			return myArray; 
			} //array to arrayList    
		List arrayList = IntStream.of(myArray) .boxed().collect(Collectors.toList()); 
		// Remove the specified element 
		arrayList.remove(index); 
		// return the resultant array 
		return arrayList.stream().mapToInt(Integer::intValue).toArray(); 
		} 
	public static void main(String[] args) {
		int[] myArray = { 11,22,33,44,55,66,77,88,99,111 }; 
		System.out.println("Original Array: " + Arrays.toString(myArray));
		int index = 10; System.out.println("Index at which element is to be deleted: " + index); 
		myArray = remove_Element(myArray, index); System.out.println("Resultant Array: " + Arrays.toString(myArray) + ' '); 
		index = 2; System.out.println("Index at which element is to be deleted: " + index); 
		myArray = remove_Element(myArray, index); System.out.println("Resultant Array: " + Arrays.toString(myArray)); 
	} 
}

