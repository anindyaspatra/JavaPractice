package com.java.practiceProblems;

import java.util.ArrayList;

import java.util.stream.Collectors;



public class SortBinaryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = { 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0 };
		ArrayList<Integer> al1 = new ArrayList<>();
		for (int i:inputArray) {
			al1.add(i);
		}

		
		ArrayList<Integer> al2 = (ArrayList<Integer>) al1.stream().filter(I->I==0).collect(Collectors.toList());
		ArrayList<Integer> al3 = (ArrayList<Integer>) al1.stream().filter(I->I==1).collect(Collectors.toList());
		
		ArrayList<Integer> newList = new ArrayList<>();
		newList.addAll(al2);
		newList.addAll(al3);
		System.out.println(newList);
	}

}
