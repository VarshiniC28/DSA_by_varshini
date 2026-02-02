package stack.problems;

import java.util.Stack;

//LC : 1541. Minimum Insertions to Balance a Parentheses String
//Given a parentheses string s containing only the characters '(' and ')'. A parentheses string is balanced if:
//Any left parenthesis '(' must have a corresponding two consecutive right parenthesis '))'.
//Left parenthesis '(' must go before the corresponding two consecutive right parenthesis '))'.
//In other words, we treat '(' as an opening parenthesis and '))' as a closing parenthesis.
//
//For example, "())", "())(())))" and "(())())))" are balanced, ")()", "()))" and "(()))" are not balanced.
//You can insert the characters '(' and ')' at any position of the string to balance it if needed.
//
//Return the minimum number of insertions needed to make s balanced.
//
//Example 1:
//Input: s = "(()))"
//Output: 1
//Explanation: The second '(' has two matching '))', but the first '(' has only ')' matching. We need to add one more ')' at the end of the string to be "(())))" which is balanced.
//
//Example 2:
//Input: s = "())"
//Output: 0
//Explanation: The string is already balanced.
//
//Example 3:
//Input: s = "))())("
//Output: 3
//Explanation: Add '(' to match the first '))', Add '))' to match the last '('.

public class MinInsertions {

	//greedy, best - TC - O(n) , SC - O(1)
	static int minInsertions(String s) {

	    int res = 0;                     // counts how many brackets we insert
	    int right_needed = 0;            // tracks how many ')' are still required

	    for (char ch : s.toCharArray()) { // loop through each character in string

	        if (ch == '(') {             // if opening bracket found
	            right_needed += 2;       // '(' always needs two '))'

	            if ((right_needed & 1) == 1) { // if count becomes odd (invalid state)
	                res++;               // insert one ')'
	                right_needed--;      // fix odd count to make it even
	            }

	        } else {                     // if closing bracket ')'
	            right_needed--;          // one required ')' is satisfied

	            if (right_needed < 0) {  // too many ')', no matching '('
	                res++;               // insert one '('
	                right_needed = 1;    // that '(' still needs one ')'
	            }
	        }
	    }

	    return res + right_needed;       // add remaining required ')' to result
	}

	//-----------------------------------------------------------
	
	//To Learn using stack - TC and SC - O(n)
	static int minInsertions1(String s) {
		
		Stack<Character> st = new Stack<>();
		int res = 0;
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch == '(') {
				st.push(ch);
			}else { //')'
				if(i < s.length() - 1 && s.charAt(i + 1) == ')') {
					i++; //skip the next ')"
				}else {
					res++; //if single ')' then add 1
				}
				
				//matched '(' can be removed
				if(!st.isEmpty()) {
					st.pop();
				}else { //if no '('
					res++; //that means we need one '('
				}
			}
		}
		
		//remaining '(' needs two ') each 
		res += st.size() * 2;
		return res;
		
	}
	
	public static void main(String[] args) {

		System.out.println(minInsertions("()))"));
		System.out.println(minInsertions1(")()"));
	}

}
