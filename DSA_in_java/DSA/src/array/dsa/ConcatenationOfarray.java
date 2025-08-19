package array.dsa;

/*Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.*/

public class ConcatenationOfarray {
	
	  static int[] getConcatenation(int[] nums) {
	        // int [] ans = new int[2*nums.length];
	        // for(int i=0; i<nums.length; i++){
	        //     ans[i]=nums[i];
	        //     ans[i+nums.length] = nums[i];
	        // }
	        // return ans;

	        int n = nums.length;
	        int[] ans = new int[2 * n];
	        System.arraycopy(nums, 0, ans, 0, n);   // copy first half
	        System.arraycopy(nums, 0, ans, n, n);   // copy second half
	        return ans;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
