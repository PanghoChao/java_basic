package org.opentutorials.javatutorials.method;

public class MethodDemo2 {
	public static String/*��ȯ��*/ numbering(int init, int limit) {
		int i = init;
		String output = "";
		while(i<limit) {
			output += i;
			i ++ ;
				
		}
		return output;
	}
		

	public static void main(String[] atgs) {
		// ��ȯ�� �ִ� �Լ��̱⿡ result�� ���� �Ű� �ش�. 
		
        String result = numbering(1, 5);
        System.out.println(result);
	}
}