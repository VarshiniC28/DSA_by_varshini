package sorting;

import java.util.Arrays;

public class SelectionSort {

	static void selectionSort(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			int last = arr.length-i-1;
			int maxIndex = getMaxIndex(arr, 0,last);
			swap(arr, maxIndex, last);
		}
	}
	
	static int getMaxIndex(int[] arr, int start, int end) {
		int max = start;
		for (int i = start; i<=end; i++) {
			if(arr[i]>arr[max]) {
				max = i; //index
			}
		}
		
		return max; //returning index
	}
	
	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

	public static void main(String[] args) {

		int[] arr = {4,3,5,7,2,1};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
