package problems;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

//WAP to insert Integer objects into TreeSet where the sorting order is Descending order
public class TestClass {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new myComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(10);
		t.add(20);
		System.out.println(t);

	}
}
class myComparator implements Comparator {

//	@Override
//	public int compare(Object o1, Object o2) {
//		// TODO Auto-generated method stub
//		return 1;
//	}

//	@Override
//	public int compare(Object o1, Object o2) {
//		// TODO Auto-generated method stub
//		Integer I1 = (Integer)o1;
//		Integer I2 = (Integer)o2;
//		return -I1.compareTo(I2);
//	}

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		Integer I1 = (Integer) obj1;
		Integer I2 = (Integer) obj2;
		if (I1 > I2) {
			return -1;
		} else if (I1 < I2) {
			return 1;
		} else {
			return -1;
		}
	}
}
