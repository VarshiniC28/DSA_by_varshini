package sorting;

import java.util.Arrays;

public class CyclicSort {

	static void cyclicSort(int[] arr) {
		int i=0;
		while(i<arr.length) {
			int correct = arr[i]-1;
			if(arr[i]!=arr[correct]) {
				swap(arr,i,correct);
			}else {
				i++;
			}
		}
	}
	
	static void swap(int[] arr, int first, int sec) {
		int temp = arr[first];
		arr[first]  = arr[sec];
		arr[sec] = temp;
	}
	
	public static void main(String[] args) {

//		int [] arr = {4,1,3,5,2};
//		cyclicSort(arr);
//		System.out.println(Arrays.toString(arr));
		
		int x = 5;
		x = x++;
		System.out.println(x);
	}

}
