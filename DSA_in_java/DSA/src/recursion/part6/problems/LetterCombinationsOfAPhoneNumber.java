package recursion.part6.problems;

import java.util.ArrayList;
import java.util.List;

//This is actually backtracking problem which will have TC : O(4^n) and SC : O(n * 4^n) - which is better than recursion way we did - no new String since there we will use StringBuilder which reuses memory
//recursion the one we  have done : TC : O(n * 4^n) and SC : O(n * 4^n) - because has new String creation at each recursion

/*Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. 
 * Return the answer in any order.
 * A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 * 
 * Example 1:
 * Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

* Example 2:
* Input: digits = "2"
Output: ["a","b","c"]
 
 * */

public class LetterCombinationsOfAPhoneNumber {
	
	//Wrong
	//TC : O(n * 3^n) and SC : O(n * 3^n)
	//but this is not possible for 7 and 9 since they have 4 chars, but we here consider it as 3 for each which will break pattern for 7 9 and 8
	static List<String> pad(String p, String up){
		if(up.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		
		int digit = up.charAt(0) - '0';
		
		ArrayList<String> ans = new ArrayList<>();
		
		for (int i = ((digit - 1) * 3)-3; i < (digit * 3)-3; i++) { //range from inclusive - [(digit -1) * 3, digit * 3) - exclusive
			char ch = (char) ('a' + i);
			ans.addAll(pad(p + ch, up.substring(1)));
		}
		
		return ans;
	}

	//-----------------=============================--------------------------------
	
	//Correct code
	static String[] map = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	static List<String> letterComb(String p, String up){
		if(up.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		
		int digit = up.charAt(0 ) - '2'; //in map array index 0-7 for digits 2-9
		String letters = map[digit];
		
		ArrayList<String> ans = new ArrayList<>();
		
		for(char ch : letters.toCharArray()) {
			ans.addAll(letterComb(p + ch, up.substring(1)));
		}
		
		return ans;
	}
	
	//count of combinations 
	static int combCount(String p, String up) {
		if(up.isEmpty()) {
			return 1;
		}
		
		int count = 0;
		int digit = up.charAt(0) - '2';
		String letters = map[digit];
		
		for (char ch : letters.toCharArray()) {
			count += combCount(p + ch, up.substring(1));
		}
		
		return count;
	}
	
	public static void main(String[] args) {

//		System.out.println(pad("", "78")); //this is wrong for 7 8 9
		
		System.out.println(letterComb("", "78")); //this is correct 
		System.out.println(letterComb("", "78").size());
		System.out.println(combCount("", "78"));
		
		//To know the number of combinations we can use count var or below
		System.out.println(letterComb("","23"));
		System.out.println(letterComb("","23").size());
		System.out.println(combCount("", "23"));
	}

}
