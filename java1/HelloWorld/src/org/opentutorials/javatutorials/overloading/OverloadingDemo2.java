package org.opentutorials.javatutorials.overloading;

public class OverloadingDemo2 extends OverloadingDemo {
	 
	void A (String arg1, String arg2){
		System.out.println("sub class : void A (String arg1, String arg2)");
		} // 오버로딩
	
	void A (){System.out.println("sub class : void A ()");} //오버라이딩
    
	public static void main(String[] args) {
	        OverloadingDemo2 od = new OverloadingDemo2();
	        od.A(); //오버라이딩
	        od.A(1); //상속
	        od.A("coding everybody"); //상속
	        od.A("coding everybody", "coding everybody"); // 오버로딩
	         
	    }
}