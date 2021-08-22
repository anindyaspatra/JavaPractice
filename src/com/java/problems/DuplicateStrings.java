package com.java.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateStrings {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] withDuplicates = new String[] {"one","two","three","one", "three"};
		//List<String> stringList = Arrays.asList(withDuplicates);
		Set<String> setList = new HashSet<>();
		
		for(String strings:withDuplicates) {
			if(!setList.add(strings)) {
				System.out.println("Duplicate: "+strings);
			}
		}
	}

}
