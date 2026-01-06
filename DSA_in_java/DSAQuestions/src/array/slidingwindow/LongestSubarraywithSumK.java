package array.slidingwindow;

//Given an array nums of size n and an integer k, find the length of the longest sub-array that sums to k. 
//If no such sub-array exists, return 0.
//Example 1
//Input: nums = [10, 5, 2, 7, 1, 9],  k=15
//Output: 4

public class LongestSubarraywithSumK {
	
	static int longestSubarray(int[] nums, int a) {
		
		//brute force :
		int len = 0;
		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			for (int j = i; j < nums.length; j++) {
				sum+=nums[j];
				if(sum == a) len = Math.max(len, j-i+1);
			}
		}
		return len;
    }

	public static void main(String[] args) {

		int[] nums = {10, 5, 2, 7, 1 ,9};
		System.out.println(longestSubarray(nums, 15));
	}

}
