package org.opentutorails.javatutorials.array;
import java.util.Arrays;

public class ElementRemove {
	public static void main(String args[]) {	

		int[] tensArray = { 10,20,30,40,50,60}; 
		System.out.println("Original Array: " + Arrays.toString(tensArray)); 
		
		int rm_index = 2;  
		System.out.println("Element to be removed at index: " + rm_index); 
		
		
		if (tensArray == null || rm_index<0 || rm_index>= tensArray.length) {
			System.out.println("No removal operation can be performed!!"); 
		}  
		
		
		int[] proxyArray = new int[tensArray.length - 1]; 
		
		for (int i = 0, k = 0; i< tensArray.length ; i++,k++) {
			if(i == 2) {
				k--;
				continue;
			}
			
			proxyArray[k] = tensArray[i];
		}
		System.out.println("change Array: " + Arrays.toString(proxyArray)); 

	}
}
