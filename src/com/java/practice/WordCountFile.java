package com.java.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.google.common.collect.Multiset.Entry;

public class WordCountFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String key = null;
		
		HashMap<String, Integer> hMap = new HashMap<>();
		
		File file = new File("E:\\Learning\\Test.txt");
		Scanner sc = new Scanner(file);
		sc = sc.useDelimiter(" ");
		while(sc.hasNext()) {
			key = sc.next();
			key = key.replace(".", "");
			if(hMap.containsKey(key)) {
				hMap.put(key, hMap.get(key)+1);
			}else {
				hMap.put(key, 1);
			}
		}
		
		
		for(Map.Entry<String, Integer> entry : hMap.entrySet()) {
			System.out.println(entry.getKey() + " - "+ entry.getValue());
		}
		
		
		
	}

}
