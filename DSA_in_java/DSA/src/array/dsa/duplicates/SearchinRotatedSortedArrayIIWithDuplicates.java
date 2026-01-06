package array.dsa.duplicates;
/*Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.
 * You must decrease the overall operation steps as much as possible.
 * Example 1:
 * Input: nums = [2,5,6,0,0,1,2], target = 0
 * Output: true*/


public class SearchinRotatedSortedArrayIIWithDuplicates {
	
	static boolean search(int[] arr,int target) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			
			if(target == arr[mid]) return true; //if want to return
			
			if(arr[start] == mid && arr[mid] == arr[end]) {
				start++;
				end--;
				continue;
			}
			
			if(arr[start] <= arr[mid]) {
				if(target >= arr[start] && target < arr[mid]) {
					end = mid - 1;
				}else {
					start = mid + 1;
				}
			}else if(arr[start] > arr[mid]) {
				if(target > arr[mid] && target <= arr[end]) {
					start = mid + 1;
				}else {
					end = mid-1;
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {2,5,6,0,0,1,2};
		System.out.println(search(arr,0));
	}

}
