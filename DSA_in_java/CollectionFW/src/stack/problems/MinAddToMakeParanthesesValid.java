package stack.problems;

import java.util.Stack;

//921. Minimum Add to Make Parentheses Valid
//A parentheses string is valid if and only if:
//
//It is the empty string,
//It can be written as AB (A concatenated with B), where A and B are valid strings, or
//It can be written as (A), where A is a valid string.
//You are given a parentheses string s. In one move, you can insert a parenthesis at any position of the string.
//
//For example, if s = "()))", you can insert an opening parenthesis to be "(()))" or a closing parenthesis to be "())))".
//Return the minimum number of moves required to make s valid.
//
//Example 1:
//Input: s = "())"
//Output: 1
//
//Example 2:
//Input: s = "((("
//Output: 3

public class MinAddToMakeParanthesesValid {

	//with stack - to learn because TC: O(n) SC: O(n)
//	static int minAddToMakeValid(String s) {
//        Stack<Character> st = new Stack<>();
//
//        for (char ch : s.toCharArray()) {
//            if (ch == '(') {
//                // Always push '(' onto the stack
//                st.push(ch);
//            } else if (ch == ')') {
//                // Pop only if there's a matching '('
//                if (!st.isEmpty() && st.peek() == '(') {
//                    st.pop();
//                } else {
//                    // No matching '(', so push ')' as unmatched
//                    st.push(ch);
//                }
//            }
//        }
//
//        // Whatever is left in the stack is unmatched
//        return st.size();
//    }
	
	
	//optimized using counters - TC: O(n) SC: O(1)
	static int minAddToMakeValid(String s) {
		int leftNeeded = 0;   // number of '(' we need to balance current ')'
		int rightNeeded = 0;  // number of ')' we need to balance current '('

		for (char ch : s.toCharArray()) {
		    if (ch == '(') {
		        rightNeeded++;       // one more ')' will be needed to balance this '('
		    } else if (ch == ')') {
		        if (rightNeeded > 0) {
		            rightNeeded--;   // this ')' balances an existing '('
		        } else {
		            leftNeeded++;    // this ')' is unmatched, we need an '(' to balance it
		        }
		    }
		}

		return leftNeeded + rightNeeded; // total parentheses to add

	}
	public static void main(String[] args) {
	
		String s = "()))";
		System.out.println(minAddToMakeValid(s));
	}
}
