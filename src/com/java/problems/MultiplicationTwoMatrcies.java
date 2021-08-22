package com.java.problems;

public class MultiplicationTwoMatrcies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = { { 1, 3 }, { 4, 5 }, { 2, 6 } };
		int[][] b = { { 6, 3, 5 }, { 2, 8, 2 } };

		int[][] c = new int[a.length][a[0].length];

		System.out.println(a.length);
		System.out.println(a[0].length);

		System.out.println(b.length);
		System.out.println(b[0].length);

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				c[i][j] = 0;
				for (int k = 0; k < a.length; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}

}
