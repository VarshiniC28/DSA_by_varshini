package binary.search;

/*There is an integer array nums sorted in ascending order (with distinct values).
 * Prior to being passed to your function, nums is possibly left rotated at an unknown index k (1 <= k < nums.length)
 * such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). 
 * For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2].
 * Given the array nums after the possible rotation and an integer target, 
 * return the index of target if it is in nums, or -1 if it is not in nums.
 * You must write an algorithm with O(log n) runtime complexity.*/

public class SearchInRotatedSortedArr { //no duplicates

	static int searchInRotatedArray(int[] nums, int target) {
		int pivot = pivot(nums);
		
		//If pivot was not found we will have -1 then we can do normal binary search
		if(pivot==-1) {
			return binarySearch(nums, target, 0, nums.length-1);
		}
		
		if(nums[pivot]==target) return pivot;
		if(target>=nums[0]) return binarySearch(nums,target,0,pivot-1);
//		if(target<nums[0]) return binarySearch(nums, target,pivot+1,nums.length);
		
		return binarySearch(nums, target,pivot+1,nums.length);
//		return -1;
	}
	
	static int binarySearch(int[] nums,int target, int start, int end) {
		while(start<=end) {
			int mid = start+(end-start)/2;
			
			if(nums[mid]>target) {
				end=mid-1;
			}else if(nums[mid]<target) start = mid+1;
			else return mid;
		}
		return -1;
	}
	
	static int pivot(int[] nums) {
		int start = 0;
		int end= nums.length-1;
		
		while(start<=end) {
			int mid = start+(end-start)/2;
			
			if(mid<end&&nums[mid]>nums[mid+1]) {
				return mid;
			}else if(mid>start&&nums[mid]<nums[mid-1]) {
				return mid-1;
			}else if(nums[mid]<=nums[start]) {
				end=mid-1;
			}else if(nums[mid]>=nums[start]) {
				start=mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
//		System.out.println(pivot(nums)); //returns index 3 i.e nums[3]=7
		
		System.out.println(searchInRotatedArray(nums, 5));
	}
}
