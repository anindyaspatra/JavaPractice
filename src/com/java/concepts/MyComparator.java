package com.java.concepts;

import java.util.Comparator;
import java.util.TreeSet;

public class MyComparator implements Comparator {

//	@Override
//	public int compare(Object o1, Object o2) {
//		// TODO Auto-generated method stub
//		Integer I1 = (Integer) o1;
//		Integer I2 = (Integer) o2;
//		if (I1 > I2)
//			return -1;
//		else if (I1 < I2)
//			return +1;
//		else
//			return 0;
//
//		/**
//		 * Various possible implementations of compare method
//		 * 
//		 * return I1.compareTo(I2); Ascending Order return -I1.compareTo(I2); Descending
//		 * Order return I2.compareTo(I1); Descending Order return -I2.compareTo(I1);
//		 * Ascending Order return 1; Insertion Order return -1; Reverse Insertion Order
//		 * return 0; Onl;y first element is Entered
//		 */
//	}

//WAP to insert integer objects into the treeset where the Sorting Order is Descending order

	public static void main(String[] args) {
		TreeSet ts = new TreeSet<>();
		ts.add(10);
		ts.add(0);
		ts.add(15);
		ts.add(20);
		ts.add(4);
		ts.add(12);
		System.out.println(ts);

		TreeSet ts2 = new TreeSet<>(new MyComparator());
		ts2.add("Sourav");
		ts2.add("Sudip");
		ts2.add("Anindya");
		ts2.add("Alok");
		ts2.add("Suvra");
		System.out.println(ts2);
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String str1 = o1.toString();
		String str2 = o2.toString();
		return -str1.compareTo(str2);

	}

//WAP to insert String Object into the TreeSet where all elements should be inserted According to Reverse of Alphabetical Order	
}
