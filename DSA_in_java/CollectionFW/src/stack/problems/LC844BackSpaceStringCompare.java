package stack.problems;

import java.util.Stack;

//Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
//Note that after backspacing an empty text, the text will continue empty.
//
//Example 1:
//Input: s = "ab#c", t = "ad#c"
//Output: true
//Explanation: Both s and t become "ac".

public class LC844BackSpaceStringCompare {

	static boolean backspaceCompare(String s, String t) {
		
		Stack<Character> st = new Stack<>();
		Stack<Character> stt = new Stack<>();
		
		for(char ch : s.toCharArray()) {
			if(ch == '#') {
				if(!st.isEmpty()) {
					st.pop();
				}
			}
			st.push(ch);
		}
		
		for(char ch : t.toCharArray()) {
			if(ch == '#') {
				if(!stt.isEmpty()) {
					stt.pop();
				}
			}
			stt.push(ch);
		}
		
		return st.equals(stt);
	}
	
	public static void main(String[] args) {

		System.out.println(backspaceCompare("ab#c", "ad#c"));
	}

}
