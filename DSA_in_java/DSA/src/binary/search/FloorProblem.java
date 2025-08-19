package binary.search;

import java.util.Arrays;

public class FloorProblem {
	
	//Find floor - greatest element i.e smaller then or = target
	static int floor(int[] arr, int target) {
		Arrays.sort(arr);
		
		int start =  0;
		int end = arr.length-1;
		
		if(target<arr[0]) {
			return -1; //target is smallest than smallest number in the array
		}
		
		while(start<=end) {
			int mid = start+(end-start)/2;
			
			if(target>arr[mid]) {
				start=mid+1;
			}else if(target<arr[mid]) {
				end = mid-1;
			}else {
				return arr[mid];
			}
		}
		return arr[end];
	}

	public static void main(String[] args) {

		int[] arr = {2,4,6,8,14,16,18};
		System.out.println(floor(arr,0));
	}

}
