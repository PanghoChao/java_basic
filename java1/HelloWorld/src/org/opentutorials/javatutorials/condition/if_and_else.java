package org.opentutorials.javatutorials.condition;

public class if_and_else {
	public static void main(String[] args) {
		String id = args[0];
		String password = args[1];
        if(id.equals("pangho")){
            System.out.println("right");
            if (password.equals("k5880")) {
            	System.out.println("right");
            	
            }
            else {
                System.out.println("wrong");
            }
        }else {
            System.out.println("wrong");

        } 
        
	}
}
