package stack.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//496. Next Greater Element I
//The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.
//
//You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
//
//For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. 
//If there is no next greater element, then the answer for this query is -1.
//
//Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.

 

public class NextGreatestElementToRIght {
	
	static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		
		Map<Integer, Integer> map = new HashMap<>();
        // Arrays.fill(ngr, -1);

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<nums2.length; i++){
            while(!stack.isEmpty() && nums2[i] > nums2[stack.peek()]){
                map.put(nums2[stack.pop()], nums2[i]);
            }
            stack.push(i);
        }
        
        // Step 2: Remaining elements have no next greater
        while (!stack.isEmpty()) {
            map.put(nums2[stack.pop()], -1);
        }

        int[] ngr = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            ngr[i] = map.get(nums1[i]);
        }

        return ngr;
	}
	
	

	public static void main(String[] args) {

		int[] arr = {4,1,2};
		int[] arr2 = {1,3,4,2};
		
		System.out.println(Arrays.toString(nextGreaterElement(arr, arr2)));
	}

}
