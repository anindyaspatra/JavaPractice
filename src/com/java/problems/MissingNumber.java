package com.java.problems;

import java.util.Arrays;
import java.util.BitSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1, 2, 3, 6, 8};
		printMissingNumber(numbers, 8);
		int sum = sumOfNum(8);
		int actualSum = 0;
		for(int i=0;i<numbers.length;i++) {
			actualSum = actualSum + numbers[i];
		}
		System.out.println(actualSum);
		System.out.println("Difference: "+(sum-actualSum));

	}
	
	static int sumOfNum(int n) {
		int sum;
		sum = (n*(n+1))/2;
		return sum;
	}
	
	private static void printMissingNumber(int[] numbers, int count) {
        int missingCount = count - numbers.length;
        BitSet bitSet = new BitSet(count);
 
        for (int number : numbers) {
            bitSet.set(number - 1);
        }
 
        System.out.printf("Missing numbers in integer array %s, with total number %d is %n",
        Arrays.toString(numbers), count);
        int lastMissingIndex = 0;

        for (int i = 1; i <= missingCount; i++) {
        	
        	//System.out.println(bitSet.nextClearBit(lastMissingIndex));
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }
 
    }

}
