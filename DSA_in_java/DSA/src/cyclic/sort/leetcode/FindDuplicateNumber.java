package cyclic.sort.leetcode;

import java.util.*;

public class FindDuplicateNumber {

	static int DuplicateNum(int[] arr) {
		
		//Using set
		Set<Integer> set = new HashSet<>();
		for (int i : arr) {
			if(set.contains(i)) { // or if(!set.add(arr))
				return i;
			}
			set.add(i);
		}
		
		//cycle sort
//		int i=0;
//		while(i<arr.length) {
//			int correct = arr[i]-1;
//			if(arr[i]!=arr[correct]) {
//				swap(arr, i, correct);
//			}
//			else {
//				i++;
//			}
//			
//		}
//		
//		for (int j = 0; j < arr.length; j++) {
//			if(arr[j]!=j+1 && arr[j]==arr[arr[j]-1]) {
//				return arr[j];
//			}
//		}
		
		return -1;
		
	}
	
	static void swap(int[] arr, int first, int sec) {
		int temp= arr[first];
		arr[first]  =arr[sec];
		arr[sec] = temp;
	}
	
	public static void main(String[] args) {

//		int [] arr = {1,3,4,4,2};
//		int [] arr = {3,3,3,3};
		int[] arr = {1,1};
		System.out.println(DuplicateNum(arr));
	}

}
