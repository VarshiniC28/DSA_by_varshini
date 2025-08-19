package array.dsa;

/*
 * Given an array of integers nums, return the number of good pairs.
 * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 * */

public class NumberofGoodPairs {
	
	static int numIdenticalPairs(int[] nums) {
		int pairCount=0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]==nums[j]) pairCount++;
			}
		}
		return pairCount;
	}

	public static void main(String[] args) {

//		int[] nums = {1,2,3,1,1,3};
		int[] nums = {1,1,1,1};  
		System.out.println(numIdenticalPairs(nums));
	}

}
