package cyclic.sort.leetcode;

import java.util.Arrays;
import java.util.Iterator;

public class MissingNumber2ndWay {
	
	static int missingNum(int[] arr) {
		
		int n = arr.length;
		int sumUptoN = n* (n + 1)/2;
		int arrSum = 0 ;
		for (int i = 0; i < arr.length; i++) {
			arrSum+=arr[i];
		}
		
		return sumUptoN - arrSum;
	}


	public static void main(String[] args) {

		int[] arr = {4,0,6,1,2,5,7}; //works only for one missing number
		System.out.print("Missing number is: ");
		System.out.println(missingNum(arr));
		System.out.println(Arrays.toString(arr));
	}

}
