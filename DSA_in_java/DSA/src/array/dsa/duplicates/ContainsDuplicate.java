package array.dsa.duplicates;

import java.util.HashSet;

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//Example 1:
//Input: nums = [1,2,3,1]
//Output: true

public class ContainsDuplicate {

	//for unsorted array
	static boolean containsDuplicate(int[] arr) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int num: arr) {
			if(!set.add(num)) return true;
			set.add(num);
		}
		
		return false;
	}
	
	//for sorted array - 1, 1, 2, 3
	static boolean containsDuplicate2(int[] arr) {
		
		for(int i =0; i<arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {

		int[] arr = {1,2,3,1};
		System.out.println(containsDuplicate(arr));
		
		int[] arr2 = {1,1,2,3};
		System.out.println(containsDuplicate(arr2));
	}

}
