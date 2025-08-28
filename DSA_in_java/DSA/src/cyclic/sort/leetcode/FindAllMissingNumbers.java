package cyclic.sort.leetcode;

import java.util.*;

/*
 * 448. Find All Numbers Disappeared in an Array
 * Given an array nums of n integers where nums[i] is in the range [1, n],
 *  return an array of all the integers in the range [1, n] that do not appear in nums.
 *  Input: nums = [4,3,2,7,8,2,3,1]
 *  Output: [5,6]
 *  Example 2:
 *  Input: nums = [1,1]
 *  Output: [2]
 * 
 * */

public class FindAllMissingNumbers {
	
	static List<Integer> findDisappearedNum(int[] arr) {
		int i=0;
		while(i<arr.length) {
			int correct = arr[i]-1;
			if(arr[i]!=arr[correct]) {
				swap(arr, i, correct);
			}else {
				i++;
			}
		}
		
		List<Integer> list = new ArrayList<>();
		
		for (int j = 0; j < arr.length; j++) {
			if(arr[j]!=j+1) {
				list.add(j+1);
			}
		}
		
		return list;
	}
	
	static void swap(int[] arr, int first, int sec) {
		int temp = arr[first];
		arr[first] = arr[sec];
		arr[sec] = temp;
	}

	public static void main(String[] args) {

		int[] arr = {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNum(arr));
		System.out.println(Arrays.toString(arr));
	}

}
