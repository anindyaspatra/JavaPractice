package problems;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Problem2 {

	public static <E> void main(String[] args)  {
		// TODO Auto-generated method stub
		//Anindya Sundar Patra. My Name is, Anindya.
		
//		//FileInputStream inputStream = new FileInputStream("");
//		String inputString = "Anindya Sundar Patra. My Name is, Anindya.";//inputStream.toString();
//		
//		String[] strArray = inputString.split(" ");
//		
//		Set<String> strSet = new HashSet<String>();
//		for(String str: strArray) {
//			strSet.add(str);
//		}
//		
//		Iterator itr = strSet.iterator();
//		Map<String, Integer> mapCount = new LinkedHashMap<String, Integer>();
//		
//		while(itr.hasNext()) {
//			if(mapCount.containsKey(itr.next().toString())) {
//				mapCount.put(itr.next().toString(), mapCount.get(itr.next())+1);
//			}else {
//				mapCount.put(itr.next().toString(), 1);
//			}
//		}
//		
//		System.out.println(mapCount);
//		
		TreeMap m = new TreeMap<>();
		
		m.put(101, "Anindya");
		m.put(100, 10.2);
		m.put(500,100);
		
		
		System.out.println(m);
		
	}

}
