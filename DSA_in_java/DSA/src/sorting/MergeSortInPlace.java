package sorting;

import java.util.Arrays;

public class MergeSortInPlace {

	static void mergeSortInPlace(int[] arr, int s, int e) {
		if(e - s == 1) return;
		
		int m = (s + e)/2;
		
		mergeSortInPlace(arr, s, m);
		mergeSortInPlace(arr, m, e);
		
		mergeInPlace(arr, s, m, e);
	}
	
	static void mergeInPlace(int[] arr, int s, int m, int e) {

		int[] merged = new int[e - s];
		
		//pointers
		int i = s;
		int j = m;
		int k = 0;
		
		while(i < m && j < e) {	
			if(arr[i] < arr[j]) {
				merged[k] = arr[i];
				i++;
			}else {
				merged[k] = arr[j];
				j++;
			}
			k++;
		}
		
		while(i < m) {
			merged[k] = arr[i];
			i++;
			k++;
		}

		while(j < e) {
			merged[k] = arr[j];
			j++;
			j++;
		}
		
		//Now lets copy our merged to our origin array arr
		for (int l = 0; l < merged.length; l++) {
			arr[s + l] = merged[l];
		}
		
	}

	public static void main(String[] args) {

		int[] arr = {5,4,3,2,1,6};
		mergeSortInPlace(arr, 0, arr.length); //here end is not arr.length - 1 because s is inclusive and e is considered as exclusive. (Eg, everywhere we use <e, not <=e
		System.out.println(Arrays.toString(arr));
	}

}
