package cyclic.sort.leetcode;

/* 645. Set Mismatch
 * You have a set of integers s, which originally contains all the numbers from 1 to n.
 * Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, 
 * which results in repetition of one number and loss of another number.
 * You are given an integer array nums representing the data status of this set after the error.
 * Find the number that occurs twice and the number that is missing and return them in the form of an array.
 * 
 * */

import java.util.Arrays;

public class SetMisMatch {
	
	static int[] findErrorNums(int[] arr) {
		int i=0;
		while(i<arr.length) {
			int correct = arr[i]-1;
			if(arr[i]!=arr[correct]) {
				swap(arr, i, correct);
			}
			else i++;
		}
		
		for (int j = 0; j < arr.length; j++) {
			if(arr[j]!=j+1 && arr[j]==arr[arr[j]-1]) {
				return new int[] {arr[j], j+1};
			}
		}
		
		return new int[0];
	}
	
	static void swap(int[] arr, int first, int sec) {
		int temp= arr[first];
		arr[first]  =arr[sec];
		arr[sec] = temp;
	}

	public static void main(String[] args) {
		
		int[] arr = {1,2,2,4};
		System.out.println(Arrays.toString(findErrorNums(arr)));
	}
}
