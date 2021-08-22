import java.util.HashSet;
import java.util.Set;

public class Problem2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "aabc";
		String str2 = "aabbbddc";

		Problem2Test.getLeastChars(str1, str2);

	}

	static void getLeastChars(String str1, String str2) {
		Set<Character> unique1 = new HashSet<Character>();
		Set<Character> unique2 = new HashSet<Character>();
		Set<Character> unique = new HashSet<Character>();

		for (int i = 0; i < str1.length(); i++) {
			unique1.add(str1.charAt(i));
		}

		for (int i = 0; i < str2.length(); i++) {
			unique2.add(str2.charAt(i));
		}

		unique1.addAll(unique2);

		System.out.println(unique1);

		for (char ch : unique1) {
			int count1 = 0;
			int count2 = 0;
			int difference = 0;
			// System.out.println(ch);
			for (int i = 0; i < str1.length(); i++) {
				if (ch == str1.charAt(i)) {
					count1++;
				}
			}
			for (int i = 0; i < str2.length(); i++) {
				if (ch == str2.charAt(i)) {
					count2++;
				}
				// System.out.println(ch + " - "+count2);
			}

			if (count1 < count2 && count1 != 0) {
				for (int i = 1; i <= count1; i++) {
					System.out.print(ch);
				}
			} else {
				for (int i = 1; i <= count2; i++) {
					System.out.print(ch);
				}
			}

		}
	}

	static void getLeastChars1(String str1, String str2) {
		
	}
}
