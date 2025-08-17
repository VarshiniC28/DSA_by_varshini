package programmingLogic;

import java.util.Arrays;

public class Swap {
	
	static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	public static void main(String[] args) {
		
		int [] arr  = {1,3,23,45,12};
		
		System.out.println(Arrays.toString(arr));
		swap(arr,0,1);
		System.out.println(Arrays.toString(arr));
		swap(arr, 1,4);
		System.out.println(Arrays.toString(arr));
	}
}
