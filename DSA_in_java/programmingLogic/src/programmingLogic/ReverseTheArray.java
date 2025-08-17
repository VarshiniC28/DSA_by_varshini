package programmingLogic;

import java.util.Arrays;

public class ReverseTheArray {
	
	//This is called 2 pointer methods
	
	static void Reverse(int[] arr) {
		int startIndex = 0;
		int endIndex = arr.length-1;
		
		while(startIndex < endIndex) {
			swap(arr, startIndex, endIndex);
			startIndex++;
			endIndex--;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	public static void main(String[] args) {

		int [] arr = {1,2,3,4,5,6};
		Reverse(arr);
	}

}
