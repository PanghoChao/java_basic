package org.opentutorails.javatutorials.array;
import java.util.Arrays; 
import java.util.stream.IntStream; 
public class ElementRemove_stream {
	public static int[] removeArrayElement(int[] oddArray, int index) { 
	
		if (oddArray == null || index <0 || index>= oddArray.length) { 
			return oddArray; 
			} 
		
		// delete the element at specified index and return the array 
		return IntStream.range(0, oddArray.length).filter(i -> i != index)
				.map(i ->oddArray[i]).toArray(); 
	}
	
	
	
	public static void main(String[] args) { 
	
		int[] oddArray = { 1, 3,5,7,9,11}; 
		System.out.println("Original Array: " + Arrays.toString(oddArray)); 

		
		int index = 2; 
		System.out.println("Element to be removed at index: " + index); 
		
		oddArray = removeArrayElement(oddArray, index); 
		System.out.println("Array after deleting element: " + Arrays.toString(oddArray)); 
		
	} 

	
}
