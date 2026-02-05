package arrays.dsa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Given two integer arrays nums1 and nums2, return an array of their intersection. 
//Each element in the result must be unique and you may return the result in any order.
//		 
//Example 1:
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2]

public class InstersectionOfArrays {
	
	//best
	//optimized tc : o(n+m) sc: o(1)
	static int[] intersection(int[] nums1, int[] nums2) {
		boolean[] present = new boolean[1001]; //acc to constraints
		
		for(int num : nums1) {
			present[num] = true;
		}
		
		int x = 0;
		for(int num: nums2) {
			if(present[num]) { //if true its present in nums1
				nums1[x++] = num;
				present[num] = false; //for uniqueness
			}
		}
		
		return Arrays.copyOf(nums1, x); //It creates a NEW array of size newLength and copies elements from the original array from index 0 up to newLength - 1.
	}
	
	//optimized rc : o(n+m), sc: o(n+m)
	static int[] intersection2(int[] nums1, int[] nums2) {
         Set<Integer> set = new HashSet<>();
         for(int num : nums1){
             set.add(num);
         }

         Set<Integer> set1 = new HashSet<>();
         for(int num: nums2){
             if(set.contains(num)){
                 set1.add(num);
             }
         }

        int i=0;
        int [] res = new int[set1.size()];
        for(int num: set1){
             res[i++] = num;
        } 

         return res;	
	}

	public static void main(String[] args) {

//		int[] ar = {1,2,2,1};
//		int[] arr = {2,2};
		int[] ar = {4,9,5};
		int[] arr = {9,4,9,8,4};
		System.out.println(Arrays.toString(intersection2(ar, arr)));
	}

}
