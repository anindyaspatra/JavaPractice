import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class SortComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 12, 3, 56, 7, 34, 67, 12, 4, 50 };

		TreeSet<Integer> ts = new TreeSet<>(new myComparator());

		for (Integer i : arr) {
			ts.add(i);
		}

		// ArrayList<Integer> al = new ArrayList<>(new myComparator());
		Iterator<Integer> it = ts.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + ",");
		}

	}

}

class myComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1 > o2) {
			return -1;
		} else if (o1 < o2) {
			return 1;
		} else {
			return 1;
		}
	}

}
