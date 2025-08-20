package binary.search;

import java.util.Arrays;

//given int[] nums, in asc order, find starting and ending position of target.
//if target is not found , return [-1,-1]
//write algorithm with O(log n) runtime complexity.
//eg:  nums = [5,7,7,8,8,10] , target = 8 -> [3,4]

public class FindFirstLastPostionofElInSorterArr { //facebook question
	
	static int[] Range(int[] nums , int target) {
		int start = RangeFirstAndLast(nums, target, true);
		int end = RangeFirstAndLast(nums,target,false);
		return new int[] {start, end};
	}
	
	static int RangeFirstAndLast(int[] nums , int target, boolean firstOccurence) {
		int ans=-1;
		int start = 0;
		int end = nums.length-1;
		while(start<=end) {
			int mid = start+(end-start)/2;
			
			if(target<nums[mid]) {
				end=mid-1;
			}else if(target>nums[mid]) {
				start=mid+1;
			}else if(target==nums[mid]) { //potential answer found
				ans=mid;
				if(firstOccurence==true) { //there might me new start on the left side of mid //to check possibility of target being left of mid
					end=mid-1;
				}else { //so here to find last occurrence(false) in case we could find target on the right side, target==mid on the right until we find
					start=mid+1;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		
		int[] arr = {6,6,6,7,7,8,8,8,10};
		System.out.println(Arrays.toString(Range(arr,10)));
	}
}
