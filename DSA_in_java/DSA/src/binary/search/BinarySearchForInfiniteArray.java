package binary.search;

import java.util.Arrays;

public class BinarySearchForInfiniteArray {
	
	static int ans(int[] arr, int target) {
		//first find the range
		//first start with a box of 2
		Arrays.sort(arr);
		int start=0;
		int end=1;
		
		//condition for the target to lie in range
		while(target>arr[end]) {
			int newStart = end+1; //this is the new start
			
			//double the box value
			//end = prevEnd + 2*size of prev array chunk
			//previous array chunks size = end-start+1
			
			end = end + 2*(end-start+1);
			start = newStart;
		}
		
		return binarySearch(arr, target, start, end);
		
	}
	
	static int binarySearch(int[] arr, int target, int start, int end) {
		
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

		//We dont know the length of the array - infinite , then for sorted we use binary search but in opposite - bottom to up - O(log n)
		//start from small chunk of array and keep moving to next chunk while doubling the size
		//start from start =0; end=1;
		
		int [] arr = {-18,-12,-4,0,2,4,15,16,18,45,89,90,99,100,101,200,400,700,900}; 
		System.out.println(ans(arr,15));
	}

}
