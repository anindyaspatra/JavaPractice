package com.java.problems;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 3, 56, 7, 34, 67, 4, 50 };
		
		SortedSet<Integer> sSet = new TreeSet<>(new myComparator());
		for (int i: arr) {
			sSet.add(i);
		}
		
		for (int i:sSet) {
			System.out.print(i+", ");
		}

	}

}


class myComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(o1 > o2) {
			return -1;
		}else if(o1<o2) {
			return 1;
		}else {
			return -1;
		}
	}
	
}