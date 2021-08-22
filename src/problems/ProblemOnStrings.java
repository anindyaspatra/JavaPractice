package problems;

import java.util.HashMap;
import java.util.Map;

public class ProblemOnStrings {
    public static void main(String[] args){
        String testText = "aaabbbbccddddd";
        HashMap<Character, Integer> charMap = new HashMap<>();

        Character c;

        for(int i = 0; i< testText.length();i++){
            c = testText.charAt(i);
            if(charMap.containsKey(c)){
                charMap.put(c,charMap.get(c)+1);
            }else
                charMap.put(c,1);
        }

        String outputString="";

        for(Map.Entry<Character, Integer> entry:charMap.entrySet()){
            outputString=outputString+entry.getKey()+entry.getValue();
        }

        System.out.println(outputString);



    }
}
