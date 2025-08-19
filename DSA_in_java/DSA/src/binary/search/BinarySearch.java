package binary.search;

import java.util.Arrays;

public class BinarySearch {
	
	static int binarySearch(int[] arr, int target) {
		Arrays.sort(arr);
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end) {
			//find the middle element
//			int mid = (start+end)/2; -> might start+end exceed the int value  
			int mid = start+(end-start)/2;
			
			if(target<arr[mid]) {
				end = mid-1;
			}else if(target>arr[mid]) {
				start = mid+1;
			}else {
				return mid; //last mid will be our target
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {

		int [] arr = {-18,-12,-4,0,2,4,3,15,16,18,45,22,89};
		System.out.println(binarySearch(arr,22 ));
	}

}
