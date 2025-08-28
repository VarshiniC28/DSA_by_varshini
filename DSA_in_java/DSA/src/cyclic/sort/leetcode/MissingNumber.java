package cyclic.sort.leetcode;

import java.util.Arrays;

public class MissingNumber {
	
	static int missingNumber(int[] arr) {
		int i=0;
		while(i<arr.length) {
			if(arr[i]<arr.length && arr[i]!=i) {
				swap(arr, i, arr[i]);
			}else {
				i++;
			}
		}
		
		for (int j = 0; j < arr.length; j++) {
			if(arr[j]!=j) {
				return j;
			}
		}
		
	return arr.length;
	}

	static void swap(int[] arr, int first, int sec) {
		int temp= arr[first];
		arr[first]  =arr[sec];
		arr[sec] = temp;
	}

	public static void main(String[] args) {

		int[] arr = {4,0,1,2};
		System.out.print("Missing number is: ");
		System.out.println(missingNumber(arr));
		System.out.println(Arrays.toString(arr));
	}

}
