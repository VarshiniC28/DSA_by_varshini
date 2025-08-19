package array.dsa;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 * Input: nums = [2,5,1,3,4,7], n = 3
 * Output: [2,3,5,4,1,7] 
 * */

public class ShuffletheArray {
	
	static int[] shuffleArr(int nums[] ,int n) {
		int [] ans = new int[2*n];
		for(int i=0; i<n; i++) {
			ans[2*i] = nums[i];
			ans[2*i+1] = nums[i+n];
		}
		return ans;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n:");
		int n = sc.nextInt();
		int[] arr = new int[2*n];
		System.out.println("Enter elements: ");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(Arrays.toString(shuffleArr(arr,n)));
	}

}
