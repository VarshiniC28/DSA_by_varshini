package sorting;

import java.util.Arrays;

public class InsertionSort {
	
	static void insertionSort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) { //i<=N-2
			for(int j=i+1; j>0; j--) {
				if( arr[j]<arr[j-1]) {
					swap(arr,j, j-1);
				}else {
					break;
				}
			}
		}
	}
	
	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

	public static void main(String[] args) {

		int[] arr = {6,-7,2,4,0,5,1};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
