package array.dsa;

import java.util.Arrays;

/*
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * Return the running sum of nums.
 * */

public class RunningSumof1DArray {

	static int[] runningSum(int[] nums) {
		for(int i=1; i<nums.length; i++) {
			nums[i]+=nums[i-1];
		}
		return nums;
	}
	
	public static void main(String[] args) {
		int [] arr= {1,2,3,4};
		System.out.println(Arrays.toString(runningSum(arr)));
	}

}
