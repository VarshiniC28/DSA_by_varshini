package stack.problems;

import java.util.Stack;

//You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.
//You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:
//An integer x. Record a new score of x.
//'+'.//Record a new score that is the sum of the previous two scores.
//'D'.//Record a new score that is the double of the previous score.
//'C'.//Invalidate the previous score, removing it from the record.
//Return the sum of all the scores on the record after applying all the operations.

public class LC682BaseballGame {
	
	static int calPoints(String[] operations) {
		Stack<Integer> st = new Stack<>();
		
		for(String op : operations) {
			if(op.equals("+")) {
				int last = st.pop();
				int secLast = st.peek();
				st.push(last);
				st.push(last + secLast);
			}
			else if(op.equals("D")) {
				st.push(2 * st.peek());
			}
			else if(op.equals("C")) {
				st.pop();
			}
			else {
				st.push(Integer.parseInt(op));
			}
		}
		
		int sum = 0;
		while(!st.isEmpty()) {
			sum += st.pop();
		}
		
		return sum;
	}

	public static void main(String[] args) {

		String[] arr = {"5","2","C","D","+"};
		System.out.println(calPoints(arr));
	}

}
