package org.opentutorials.javatutorials.array;

import java.util.Arrays;

public class ArrayPrint {
	public static void main(String[] args) {
        int[] members = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < members.length; i++) {
            int member = members[i];
            System.out.println(member);
        }
		int[] arr = { 1, 2, 3, 4, 5 };
	
		
		String str = new String(new char[4]).replace("\0", "*");
		System.out.println(str);
		// "****"

			
		String str2 = "1,2,3,4,5";
		String[] arr2 = str2.split(",");
		System.out.println(Arrays.toString(arr2));
		String str3 = "반가워요";
		str3.replace("반가","고마");
		
		System.out.println(Arrays.toString(arr));
	
	}
	
}