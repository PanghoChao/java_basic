package org.opentutorials.javatutorials.method;

public class MethodDemo2 {
	public static String/*반환값*/ numbering(int init, int limit) {
		int i = init;
		String output = "";
		while(i<limit) {
			output += i;
			i ++ ;
				
		}
		return output;
	}
		

	public static void main(String[] atgs) {
		// 반환이 있는 함수이기에 result로 값을 옮겨 준다. 
		
        String result = numbering(1, 5);
        System.out.println(result);
	}
}