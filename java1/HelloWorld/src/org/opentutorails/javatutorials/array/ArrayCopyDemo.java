package org.opentutorails.javatutorials.array;

import java.util.Arrays; 

public class ArrayCopyDemo {

	public static void main(String[] args) {
		int[] intArray = { 10,20,30,40,50 }; 
		System.out.println("Original Array: " + Arrays.toString(intArray)); 
		
		int index = 2; 
		System.out.println("Element to be deleted at index: " + index); 

 
		if (intArray == null || index <0 || index>= intArray.length) { 
			System.out.println("No removal operation can be performed!!"); 
		} 

        //������ element ���� �迭ũ�� �����
		int[] copyArray = new int[intArray.length - 1]; 
		
        //������ element �ձ��� ���� 
		System.arraycopy(intArray, 0, copyArray, 0, index); 
		//������ element �ں��� ����
		System.arraycopy(intArray, index + 1, copyArray, index, intArray.length - index - 1); 
		
		System.out.println("Array after deleting an element: " + Arrays.toString(copyArray)); 
	} 
}