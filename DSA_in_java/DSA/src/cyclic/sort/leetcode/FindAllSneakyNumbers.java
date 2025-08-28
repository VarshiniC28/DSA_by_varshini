package cyclic.sort.leetcode;

import java.util.Arrays;

/* 3289. The Two Sneaky Numbers of Digitville
 * In the town of Digitville, there was a list of numbers called nums containing integers from 0 to n - 1. 
 * Each number was supposed to appear exactly once in the list, however, two mischievous numbers sneaked in an additional time, making the list longer than usual.
 * As the town detective, your task is to find these two sneaky numbers. 
 * Return an array of size two containing the two numbers (in any order), so peace can return to Digitville.
Example 1:
Input: nums = [0,1,1,0]
Output: [0,1]
Explanation:
The numbers 0 and 1 each appear twice in the array.
 * */

public class FindAllSneakyNumbers {
	
	 static int[] getSneakyNumbers(int[] arr) {
	        int i=0;
	        while(i<arr.length){
	            if(arr[i]<arr.length && arr[i]!=arr[arr[i]]){
	                swap(arr, i, arr[i]);
	            }else i++;
	        }

	        int[] res = new int[2];
	        int k=0;
	        for(int j=0; j<arr.length; j++){
	            if(arr[j]!=j){
	            	res[k++] = arr[j];
	            	if(k==2) break;
	            }
	        }

	        return res;
	 }
	
	 
	    static void swap(int[] arr, int first, int sec){
	        int temp = arr[first];
	        arr[first] = arr[sec];
	        arr[sec] = temp;
	    }

	public static void main(String[] args) {

		int [] arr = {0,2,1,0,2};
		System.out.println(Arrays.toString(getSneakyNumbers(arr)));
	}

}
