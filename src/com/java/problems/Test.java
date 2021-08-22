package com.java.problems;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
//        int i = scan.nextInt();
//        double d = scan.nextDouble();
//        scan.hasNext();
//        String s = scan.next();
//
//        // Write your code here.
//
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);
        
        
//     // String input
//        String name = myObj.nextLine();

        // Numerical input
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();
     // String input
        String name = myObj.nextLine();

        // Output input by user
        System.out.println("Name: " + name); 
        System.out.println("Age: " + age); 
        System.out.println("Salary: " + salary); 
    }
}
