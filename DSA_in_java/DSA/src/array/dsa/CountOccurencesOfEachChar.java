package array.dsa;

import java.util.HashMap;
import java.util.Map;

public class CountOccurencesOfEachChar {
    
    static void occurence(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        //to print
        System.out.println(map);
        //or
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    
 // now to return the maximum occurred character and count of it
    static void maxOccuredChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        char maxChar = '\0';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        System.out.println("Most occurred character: " + maxChar);
        System.out.println("Count: " + maxCount);
    }


    public static void main(String[] args) {
        occurence("Hello");
        maxOccuredChar("Hello");
    }
}
