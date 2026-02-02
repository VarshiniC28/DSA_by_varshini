package stack.problems;

import java.util.Stack;

//LC:84. Largest Rectangle in Histogram

//Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.
//
//Example 1:
//Input: heights = [2,1,5,6,2,3]
//Output: 10
//Explanation: The above is a histogram where width of each bar is 1.
//The largest rectangle is shown in the red area, which has an area = 10 units.
//
//Example 2:
//Input: heights = [2,4]
//Output: 4

public class HistogramStack {
	
	 static int largestRectangleArea(int[] heights) {
		 
		 int max = 0;
		 Stack<Integer> st = new Stack<>(); //holds indices //height is pushed as along it is in increasing order
		 
		 for (int i = 0; i < heights.length; i++) {
			while(!st.isEmpty() && heights[i] < heights[st.peek()]) {
				max = getMax(heights, st, max, i);
			}
			st.push(i);//index is pushed 
		}
		 
		//cleanup loop : those elements which has no next smallest bar at all they should be measured till last bar heights.length -1 
		int i = heights.length;
		while(!st.isEmpty()) {
			getMax(heights, st, max, i);
		}
		 
		return max;
	 }

	 
	 static int getMax(int[] arr, Stack<Integer> stack, int max, int i) {
		 int area = 0;
		 
		 //idx of small bar we got
		 int popped = stack.pop(); //popped the small bar we met to calculate the area of prev possible rectangle
		 
		 if(stack.isEmpty()) { //if empty means there is only one bar
			 area = arr[popped] * i; //number of bars - i passed us give width(width) * height - arr[popped]
		 }else {
			 area = arr[popped] * (i - 1 - stack.peek()); //to know the width: right - left - 1, -1 because we dont consider the small bar height that we met 
		 }
		 
		 return Math.max(area, max);
	 }
	 
	 
	public static void main(String[] args) {
		
		int[] arr = {2,1,5,6,2,3};
		System.out.println(largestRectangleArea(arr));
	}

}
