package array.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*
 *Given two arrays of integers nums and index. Your task is to create target array under the following rules:
 *Initially target array is empty.
 *From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
 *Repeat the previous step until there are no elements to read in nums and index.
 *Return the target array.
 *
 *It is guaranteed that the insertion operations will be valid. 
 * */

public class TargetArrayinGivenOrder {

	static int[] createTargetArray(int[] nums, int[] index) {
		ArrayList<Integer> a = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			a.add(index[i], nums[i]);
		}
		
		int target[] = new int[a.size()];
		for (int i = 0; i < a.size(); i++) {
			target[i] = a.get(i);
		}
		
		return target;
	}
	
	public static void main(String[] args) {

		int [] arr= {0,1,2,3,4};
		int [] index = {0,1,2,2,1};
		System.out.println(Arrays.toString(createTargetArray(arr, index)));
	}

}
