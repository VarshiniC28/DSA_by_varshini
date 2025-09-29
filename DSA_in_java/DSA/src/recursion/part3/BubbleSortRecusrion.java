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
	
	public static void main(String[] args) {

		int[] arr = {4,3,2,1};
		bubbleSort(arr, arr.length - 1, 0);
		System.out.println(Arrays.toString(arr));
	}

}
