package stack.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

//You are given an integer array arr[ ]. For every element in the array, your task is to determine its Next Smaller Element (NSE).

//The Next Smaller Element (NSE) of an element x is the first element that appears to the right of x in the array and is strictly smaller than x.
//If no such element exists, assign -1 as the NSE for that position.
//Examples:
//Input: arr[] = [4, 8, 5, 2, 25]
//Output: [2, 5, 2, -1, -1]

public class NextSmallestNumberToRIght {
	
	static ArrayList<Integer> nextSmallerEle(int[] arr) {
		
		ArrayList<Integer> nsr = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			nsr.add(-1);
		}
		
		Stack<Integer> stack =  new Stack<>();
		
		for (int i = 0; i < arr.length; i++) {
			while(!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
				nsr.set(stack.pop(), arr[i]);
			}
			stack.push(i);
		}
		
		return nsr;
	}
	
	//return array format
static int[] nextSmallerElement(int[] arr) {
		
		int[] nsr = new int[arr.length];
		
		Arrays.fill(nsr, -1);
		
		Stack<Integer> stack =  new Stack<>();
		
		for (int i = 0; i < arr.length; i++) {
			while(!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
				nsr[stack.pop()] = arr[i];
			}
			stack.push(i);
		}
		
		return nsr;
	}

	public static void main(String[] args) {

		int[] arr = {4, 8, 5, 2, 25};
        System.out.println(nextSmallerEle(arr));
        
        int[] arr1 = {4, 8, 5, 2, 25};
        System.out.println(Arrays.toString(nextSmallerElement(arr1)));
	}

}
