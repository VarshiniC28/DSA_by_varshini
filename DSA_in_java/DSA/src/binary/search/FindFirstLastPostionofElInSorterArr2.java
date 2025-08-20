package binary.search;

import java.util.Arrays;

//given int[] nums, in asc order, find starting and ending position of target.
//if target is not found , return [-1,-1]
//write algorithm with O(log n) runtime complexity.
//eg:  nums = [5,7,7,8,8,10] , target = 8 -> [3,4]

public class FindFirstLastPostionofElInSorterArr2 { //facebook question
	
	static int[] Range(int[] nums , int target) {
//		int start = 0;
//		int end = nums.length-1;
//		
//		//brute force- 2 pointer version : O(N) but since we are asked O(log N) will use binary search
//		for (int i = 0; i < nums.length; i++) {
//			if(target==nums[start]&&target==nums[end]) {
//				return new int[] {start,end};
//			}else if(target!=nums[start]) {
//				start++;
//			}else if(target!=nums[end]) {
//				end--;
//			}
//		}
//		return new int[] {start, end};
		
		//---------------------------------------------------------------------------
		
//		another plain brute force
		int start=-1;
		int end=-1;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]==target) {
				if(start==-1) {
					start=i;
				}
				end=i;
			}
		}
		return new int[] {start, end};
			
		//--------------------Check BinarySearch in the file 2 of same name-------------------------------------------------------
	}

	public static void main(String[] args) {
		
		int[] arr = {6,6,6,7,7,8,8,8,10};
		System.out.println(Arrays.toString(Range(arr,8)));
	}
}
