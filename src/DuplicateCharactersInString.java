import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputString = "Anindya, test,";
		LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();
		for (int i=0;i<inputString.length();i++) {
			char c = inputString.toLowerCase().charAt(i);
			if(charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c)+1);
			}else
				charCount.put(c, 1);
		}
		
		
		for(Entry<Character, Integer> key:charCount.entrySet()) {
			if(key.getValue()>1) {
				System.out.print(key.getKey()+" ");
			}
		}
		
		System.out.println();

		Set<Character> unique = new HashSet<>();
		for (int i=0;i<inputString.length();i++) {
			char c = inputString.toLowerCase().charAt(i);
			unique.add(c);
		}
		
		Iterator itr = unique.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+",");
		}
	}

}
