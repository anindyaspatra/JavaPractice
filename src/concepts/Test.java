package concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Test {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vh = () -> {
			System.out.println("Test Car");
		};
		vh.Car();
		vh.print("Entered Text");
		Vehicle.println("New Entered Text");

		SingleObject sO = SingleObject.getInstance();
		sO.showMessage();

		ArrayList aList = new ArrayList<String>();
		aList.add(1);
		aList.add("A");
		ListIterator<E> iterator = aList.listIterator();
		System.out.println(iterator.getClass().getName());
		while (iterator.hasNext()) {
			System.out.println("Value is : " + iterator.next());
		}
		
		Collections.synchronizedList(aList);
	}

}
