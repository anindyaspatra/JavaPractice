import java.util.HashMap;
import java.util.Map;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputStr = "ABVSDGJSbbacbjhgs";

		inputStr = inputStr.toLowerCase();

		char[] chArray = inputStr.toCharArray();

		Map<Character, Integer> countMap = new HashMap<Character, Integer>();

		for (char c : chArray) {
			if (countMap.containsKey(c)) {
				countMap.put(c, countMap.get(c) + 1);
			} else {
				countMap.put(c, 1);
			}
		}

		System.out.println(countMap);
		
		Map<Character, Integer> cMap = new HashMap<Character, Integer>();
		
		char ch;
		
		for(int i = 0;i<inputStr.length();i++) {
			ch = inputStr.charAt(i);
			if (cMap.containsKey(ch)) {
				cMap.put(ch, cMap.get(ch) + 1);
			} else {
				cMap.put(ch, 1);
			}
		}
		
		System.out.println(cMap);

	}

}
