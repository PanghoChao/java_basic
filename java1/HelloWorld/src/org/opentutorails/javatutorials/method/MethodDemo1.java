package org.opentutorails.javatutorials.method;

public class MethodDemo1 {
	public static void numbering() {
		int i = 0;
		while (i<10) {
			System.out.println(i);
			i++;
		}
	}
    
	public static void numbering2(int limit) {
		int i = 0;
		while (i< limit) {
			System.out.println(i);
			i++;
		}
	}
	public static void main(String[] args) {
        numbering();
        numbering2(5);
    }
    
   
}
