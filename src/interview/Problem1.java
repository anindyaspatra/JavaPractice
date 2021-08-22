package interview;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String, String> tMap = new TreeMap<String, String>();
		tMap.put("cat", "value3");
		tMap.put("ant", "value1");
		tMap.put("bat", "value2");

		System.out.println(tMap);
		charCount();
		decimalToBinary();
		stringReverse();

	}

	public static void decimalToBinary() {
		int inputInt = 10;
		System.out.println(d2B(inputInt));
	}

	public static int d2B(int a) {
		int sum;
		if (a > 0) {
			sum = a % 2;
			return sum + 10 * d2B(a / 2);
		}
		return 0;
	}

	public static void charCount() {
		String inputStr = "shagrtankksfdeeajjssawwdbdjs";
		Map<Character, Integer> tMap = new HashMap<Character, Integer>();
		char c;
		for (int i = 0; i < inputStr.length(); i++) {
			c = inputStr.charAt(i);
			if (tMap.containsKey(c)) {
				tMap.put(c, tMap.get(c) + 1);
			} else {
				tMap.put(c, 1);
			}
		}
		System.out.println(tMap);
	}

	@SuppressWarnings("null")
	public static void stringReverse() {
		String inputStr = "Anindya Sundar Patra";
		for (int i = inputStr.length() - 1; i >= 0; i--) {
			System.out.print(inputStr.charAt(i));
		}

		System.out.println();
		char[] inputArray = inputStr.toCharArray();

		char[] outputArray = new char[inputArray.length];
		int a = 0;
		for (int i = inputArray.length - 1; i >= 0; i--) {
			System.out.println(i);
			outputArray[a] = inputArray[i];
			a++;
		}
		System.out.println(outputArray);
	}
}
