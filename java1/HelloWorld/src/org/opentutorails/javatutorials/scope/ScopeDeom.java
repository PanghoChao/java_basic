package org.opentutorails.javatutorials.scope;

public class ScopeDeom {
	
	static void a() {
		int i =0;
		
	}

	 public static void main(String[] args) {
	        for (int i = 0; i < 5; i++) {
	            a();
	            System.out.println(i);
	        }
	    }
}
