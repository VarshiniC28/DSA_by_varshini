package binary.search;

/*852. Peak Index in a Mountain Array
 * You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
 * Return the index of the peak element.
 * Your task is to solve it in O(log(n)) time complexity.
 * Example 1: Input: arr = [0,1,0] .... Output: 1
 * */

public class PeakMountainProblem {
	
	static int peak(int[] arr) {
		int start=0;
		int end=arr.length;
		
		while(start<end) {
			int mid= start+(end-start)/2;
			
			if(arr[mid]<arr[mid+1]) {
				start=mid+1;
			}else if(arr[mid]>arr[mid+1]) {
				end=mid;
			}
		}
		return start;
	}

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,45,3,2,1};
		System.out.println(peak(arr));
	}

}
