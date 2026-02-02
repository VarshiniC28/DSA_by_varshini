package strings;

import java.util.Stack;

//LC 20
//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.

public class ValidParantheses {
	
	static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		
		for(char ch : s.toCharArray()) {
			if(ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			}else {
				if(ch == ')') {
					if(stack.isEmpty() || stack.pop() != '(') return false;
				}
				if(ch == '}') {
					if(stack.isEmpty() || stack.pop() != '{') return false;
				}
				if(ch == ']') {
					if(stack.isEmpty() || stack.pop() != '[') return false;
				}
			}
		}
		
		return stack.isEmpty(); //Because if s = "(" or "((" else loop will never run and will return true instead of false;
	}

	public static void main(String[] args) {

		System.out.println(isValid("{{()}}"));
	}

}
