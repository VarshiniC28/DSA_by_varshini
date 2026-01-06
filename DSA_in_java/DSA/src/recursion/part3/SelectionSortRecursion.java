package recursion.part3;

import java.util.Arrays;

public class SelectionSortRecursion {
	
	static void selectionSort(int[] arr, int i, int j, int max) {
		 if(i == 0) return;
		 
		 if(j < i) { // or j<=i if we dont pass i as arr.length - 1, and in swap part we use arr[i] instead of arr[i - 1]
			 if(arr[j] > arr[max]) {
				 selectionSort(arr, i, j+1, j);
			 }else {
				 selectionSort(arr, i, j+1, max);
			 }
		 }else {
			 int temp = arr[max];
			 arr[max] = arr[i-1];
			 arr[i-1] = temp;
			 selectionSort(arr, i-1, 0, 0);    
		 }
	}
	
	public static void main(String[] args) {

		int[] arr = {4, 3, 2, 1};
		selectionSort(arr, arr.length, 0, 0);
		System.out.println(Arrays.toString(arr));
	}

}
