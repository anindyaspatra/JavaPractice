package problems;

import java.util.Comparator;
import java.util.TreeMap;

class TestComparator {


	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		TreeMap tm = new TreeMap(new MyComparator());
		
	}

	static class MyComparator implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			String s1 = o1.toString();
			String s2 = o2.toString();
			return s1.compareTo(s2);
		}
		
	}

}
