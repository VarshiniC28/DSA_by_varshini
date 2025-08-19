package binary.search;

import java.util.Arrays;

public class CeilningProblem {
	
	//Find ceiling - smallest element i.e greater then or = target
	static int ceiling(int[] arr, int target) {
		Arrays.sort(arr);
		
		int start =  0;
		int end = arr.length-1;
		
		while(start<=end) {
			int mid = start+(end-start)/2;
			
			if(target>arr[arr.length-1]) { //target is greatest than the greatest element in the array return -1;
				return -1;
			}
			
			if(target>arr[mid]) {
				start=mid+1;
			}else if(target<arr[mid]) {
				end = mid-1;
			}else {
				return arr[mid];
			}
		}
		return arr[start];
	}

	public static void main(String[] args) {

		int[] arr = {2,4,6,8,14,16,18};
		System.out.println(ceiling(arr,19));
	}

}
