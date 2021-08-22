package com.java.practice;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows;
		
		System.out.println("Enter the number of rows.");
		
		Scanner sc = new Scanner(System.in);
		rows = sc.nextInt();
		
		for(int i = 1; i<=rows;i++) {
			for(int k = rows-i;k>0;k--) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
