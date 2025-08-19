package array.dsa;

import java.util.Arrays;

public class Arrayfrompermutation {

	 static int[] buildArray(int[] nums) {

	        int[] ans = new int[nums.length];
	        
	        for (int i = 0; i < nums.length; i++) {
	            ans[i] = nums[nums[i]];
	        }
	        return ans;
	    }
	 
	public static void main(String[] args) {

		int [] arr= {1,2,3,0}; //they should be indexes, if we add 4 then nums[nums[i]] will be out of boun
		System.out.println(Arrays.toString(buildArray(arr)));
	}

}
