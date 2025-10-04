package sorting;

import java.util.Arrays;

public class MergeSorting { 
	
		//In this we create new array objects at each step
	
		//instead we can also do in place with no new arrays //Will do in next 
		
		//dividing array
		static int[] mergeSort(int[] arr) {
			
			//Base condition
			if(arr.length == 1) return arr;
			
			int mid = arr.length / 2;
			
			int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
			int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
			
			return merge(left, right);
		}

	//merge 
	static int[] merge(int[] first, int[] second) {
		
		int[] merge = new int[first.length + second.length];
		
		int i = 0; //pointer of first array
		int j = 0; //pointer of second array
		int k = 0; //pointer of merge array
		
		while(i < first.length && j < second.length) {
			if(first[i] < second[j]) {
				merge[k] = first[i];
				i++;
			}else {
				merge[k] = second[j];
				j++;
			}
			
			k++;
		}
		
		//copying the remaining elements
		while(i < first.length) {
			merge[k] = first[i];
			i++;
			k++;
		}
		
		while(j < second.length) {		
			merge[k] = second[j];
			j++;
			k++;
		}
		
		return merge;
		
	}

	public static void main(String[] args) {
		
		//Merge Sort:
		//Time complexity: O(N*log(N))
		//At every level, N elements are being merged
		
		//Space complexity:  
		
		int[] arr = {8,3,4,12,5,6};
		arr = mergeSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
}
