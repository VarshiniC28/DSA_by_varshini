package binary.search;

public class RotatedArraysRotationCounts { //no duplicates

	static int RotationCounts(int[] nums) {
		if(pivot(nums)==nums.length-1) return 0;//no rotation if pivot element and end element is same.
		return pivot(nums) +1; //always rotation count will be pivot+1;
	}
	
	//if array also has duplicates use pivot code for duplicates which is in different file.
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
//		int[] nums = {3,4,5,1,2}; //original = 1,2,3,4,5 - so rotation count should be 3 i.e pivot+1;
		int[] nums = {4,5,6,7,0,1,2};
		System.out.println(RotationCounts(nums));
	}
}
