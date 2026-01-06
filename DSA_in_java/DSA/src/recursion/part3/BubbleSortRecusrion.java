package recursion.part3;

import java.util.Arrays;

public class BubbleSortRecusrion {

	static void bubbleSort(int[] arr, int i, int j) {
		if(i == 0) return;
		
		if(j < i) {
			
			if(arr[j] > arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
			
			bubbleSort(arr,i, j+1);
		}else {
			
			bubbleSort(arr, i-1, 0);
		}
	}
	
	//or
	
	static void bubbleSort2(int[] arr, int i, int j) {
		if(i == arr.length) return;
		
		if(j < arr.length-i) {
			
			if(arr[j-1] > arr[j]) {
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
			}
			
			bubbleSort2(arr,i, j+1);
		}else {
			
			bubbleSort2(arr, i+1, 1);
		}
	}
	
	public static void main(String[] args) {

		int[] arr = {4,3,2,1};
		bubbleSort(arr, arr.length - 1, 0);
		System.out.println(Arrays.toString(arr));
		
		int[] nums = {3,4,5,1,19,2,1};
		bubbleSort2(nums,0,1);
		System.out.println(Arrays.toString(nums));
	}

}
