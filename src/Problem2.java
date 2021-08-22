import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Problem2 {

	public static void main(String[] args) {
		String str1 = "aabc";// abc abc
		String str2 = "abbbddc";// def abcd//a-1, b-3, d-2, c-1
		// 3
		int count1 = 0;
		int count2 = 0;
		Set<Character> unique = new HashSet<Character>();
		Set<Character> unique2 = new HashSet<Character>();

		for (int i = 0; i < str1.length(); i++) {
			unique.add(str1.charAt(i));
		}

		for (int i = 0; i < str2.length(); i++) {
			unique2.add(str2.charAt(i));
		}

		int difference = 0;

		for (Character uniqueChar : unique) {
			count1 = 0;
			count2 = 0;
			for (int i = 0; i < str1.length(); i++) {
				if (uniqueChar.equals(str1.charAt(i))) {
					count1++;
				}
			} // a =2

			for (int i = 0; i < str2.length(); i++) {
				if (uniqueChar.equals(str2.charAt(i))) {
					count2++;
				}
			}
		}

		difference = (count1 > count2) ? (difference + (count1 - count2)) : (difference + (count2 - count1));

		if (count1 > count2) {
			difference = difference + (count1 - count2); // 1
		} else {
			difference = difference + (count2 - count1); // 1
		}
		System.out.println(difference);
	}

}
