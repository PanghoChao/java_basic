package org.opentutorails.javatutorials.Inheritance.example;

class Calculator {
    int left, right;

    public Calculator(int left, int right){ //클래스이름과 같은 생성자
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 
class SubstractionableCalculator extends Calculator {
    public SubstractionableCalculator(int left, int right) {
		super(left, right);
    }
 
    public void substract() {
        System.out.println(this.left - this.right);
    }
}


public class SuperInheritance {
    public static void main(String[] args) {
    	SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
