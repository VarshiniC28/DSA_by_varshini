package binary.search;


public class SearchInRotatedSortedArrWithDuplicateElements { 

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
	
	//to find pivot if there is duplicates in the array
	static int pivot(int[] nums) {
		int start = 0;
		int end= nums.length-1;
		
		while(start<=end) {
			int mid = start+(end-start)/2;
			
			if(mid<end&&nums[mid]>nums[mid+1]) {
				return mid;
			}else if(mid>start&&nums[mid]<nums[mid-1]) {
				return mid-1;
			}
			
			//if elements at middle, start, end are equal then just skip the duplicates
			if(nums[mid]==nums[start] && nums[mid]==nums[end]) {
				//skip the duplicates
				//NOTE : What if elements at start and end were pivot?
				//check if start is pivot
				if(nums[start]>nums[start+1]) return start;
				start++;
				
				//check if end is pivot
				if(nums[end]<nums[end-1]) return end-1;
				end--;
			}
			//left side is sorted, so pivot should be at right
			else if(nums[start]<nums[mid] || (nums[start]==nums[mid] && nums[mid]>nums[end])) {
				start=mid+1;
			}
			else {
				end=mid-1;
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
