package array.dsa.duplicates;

import java.util.HashMap;

/*Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 * Example 1:
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
*/

public class ContainsDuplicateII {
	
	//Brute force
	static boolean containsNearbyDuplicate(int[] nums, int k) {
        
         //Brute force O(n^2)- gives TLE for many test cases
         for(int i=0; i<nums.length; i++){
             for(int j=i+1; j<nums.length; j++){
                 if(nums[i]==nums[j] && Math.abs(i-j) <= k){
                     return true;
                 }
             }
         }
         return false;
	}
	
	//Optimized ( correct ) - O(n)
	static boolean containsNearbyDuplicate2(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i])) {
				int prevIndex = map.get(nums[i]);
				if(i - prevIndex <= k) return true;
			}
			
			map.put(nums[i], i);
		}
        
        return false;
	}

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,1};
		System.out.println(containsNearbyDuplicate(arr, 3));
		
		int[] arr1 = {1,2,3,1};
		System.out.println(containsNearbyDuplicate2(arr1, 3));
	}
}
