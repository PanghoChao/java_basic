package org.opentutorails.javatutorials.io;

import java.util.Scanner;


public class ScannerDemo {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i*1000);
        int j = sc.nextInt();
        System.out.println(j*2000);
        sc.close();
    }	

}
