package problems;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class Problem5 extends Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray= {0,1,-1,0,1,2,0,1,-1};
		
		SortedMap<Integer, Integer>sMap = new TreeMap();
		
		for (int i=0;i<intArray.length;i++) {
			if(sMap.containsKey(intArray[i])) {
				sMap.put(intArray[i], sMap.get(intArray[i])+1);
			}else {
				sMap.put(intArray[i], 1);
			}
		}
		
		sMap.entrySet().stream().forEach((q)->{
			System.out.println(q.getValue());
		});
		
		Test t = new Problem5();
		t.m1();
		
	}
	
	public void m1() {
		System.out.println("Inside Problem Class - M1");
	}
	
	static void getOccurences(String str) {
		
	}

}

class Test{
	public void m1() {
		System.out.println("Inside Test Class - m1");
	}
	
	protected void m2() {
		System.out.println("Inside Test Class - m2");
	}
}
