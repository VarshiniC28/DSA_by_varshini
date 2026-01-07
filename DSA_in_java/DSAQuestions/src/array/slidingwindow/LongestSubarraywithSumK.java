package array.slidingwindow;

import java.util.HashMap;

//Given an array nums of size n and an integer k, find the length of the longest sub-array that sums to k. 
//If no such sub-array exists, return 0.
//Example 1
//Input: nums = [10, 5, 2, 7, 1, 9],  k=15
//Output: 4

public class LongestSubarraywithSumK {
	
	static int longestSubarray(int[] nums, int a) {
		
		//brute force : O(n^2)
//		int len = 0;
//		for (int i = 0; i < nums.length; i++) {
//			int sum = 0;
//			for (int j = i; j < nums.length; j++) {
//				sum+=nums[j];
//				if(sum == a) len = Math.max(len, j-i+1);
//			}
//		}
//		return len;
		
		
		
		//Optimal Approach : HashMap and prefix sum - if array has all -ves, +ves and 0's
//		HashMap<Integer, Integer> map = new HashMap<>();
//
//        int sum = 0, mLen = 0;
//
//        for(int i=0; i<nums.length; i++){
//            sum+=nums[i];
//
//            if(sum==a) mLen = i+1;
//
//            if(map.containsKey(sum - a)){
//                int len = i - map.get(sum - a);
//                mLen = Math.max(len, mLen);
//            }
//
//            if(!map.containsKey(sum)) map.put(sum, i);
//        }
//
//        return mLen;
        
        
		//but if array has no -ves , then more optimal approach would be (2 pointer) sliding window
        
		int mLen = 0;
		int sum = 0;
		int i = 0, j=0;
		
		while(j < nums.length) {
			
			sum += nums[j];
			
			while(sum > a && i<=j) {
				sum-=nums[i];
				i++;
			}
			
			if(sum == a) mLen = Math.max(mLen, j-i+1);
			
			j++;
		}
		
		return mLen;
    }
	
	
	

	public static void main(String[] args) {

//		int[] nums = {10, 5, 2, 7, 1 ,9};
//		int[] nums = {-1, 1, 1};
//		System.out.println(longestSubarray(nums, 1));
		
		
		//but if array has no -ves , then more optimal approach would be (2 pointer) sliding window
		int[] nums = {10, 5, 2, 7, 1 ,9};
		System.out.println(longestSubarray(nums, 15));
		
	}

}
