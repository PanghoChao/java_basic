package org.opentutorails.javatutorials.classinstance;

class Calculator3{

	public static void sum(int left, int right) {
		System.out.println(left + right); //인자를 바로 넣어준다.
	}
	public static void avg(int left, int right) {
		System.out.println((left +right)/2);
	}
}
public class CalculatorDemo3 {
	public static void main(String arg[]) {
		Calculator3.sum(10, 20);
		Calculator3.avg(10, 20);
		
		Calculator3.sum(20, 40);
		Calculator3.avg(20, 40);
	}
}

