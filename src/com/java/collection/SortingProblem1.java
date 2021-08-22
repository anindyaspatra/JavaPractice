package com.java.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class SortingProblem1 implements Comparable<String> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] al = { 3, 3, 2, 4, -1, 0, 3, -2, 4 };

		TreeMap<Integer, Integer> hMap = new TreeMap();

		for (int i = 0; i < al.length; i++) {
			if (hMap.containsKey(al[i])) {
				hMap.put(al[i], hMap.get(al[i]) + 1);
			} else {
				hMap.put(al[i], 1);
			}
		}

		hMap.forEach((k,v)->{
			for(int i = 0;i<hMap.get(k);i++) {
				System.out.print(k+", ");
			}
		});
		
		
		for(Map.Entry<Integer, Integer> entry:hMap.entrySet()) {
			System.out.println(entry.getKey() + "/" + entry.getValue());
		}

	}

	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
