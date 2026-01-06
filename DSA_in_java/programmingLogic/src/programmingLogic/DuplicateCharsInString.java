package programmingLogic;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharsInString {
	
	static void duplicateCharacter(String s) {
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char ch: s.toCharArray()) {
			if(map.containsKey(ch)) map.put(ch, map.get(ch)+1);
			else map.put(ch, 1);
		}
		
		Set<Character> set = map.keySet();
		
		for(char ch: set) {
			if(map.get(ch) > 1) {
				System.out.println(ch + ": " + map.get(ch));
			}
		}
	}

	public static void main(String[] args) {

		String s = "Java Programming";
		duplicateCharacter(s);
	}

}
