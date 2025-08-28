package cyclic.sort.leetcode;

/* 41. First Missing Positive
 * Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
 * You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
Example 1:
Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
 * */

public class FirstMissingPositive {
	
	static int firstMissingPositive(int[] arr) {
		int i=0;
		while(i<arr.length) {
			int correct = arr[i]-1;
			if(arr[i]>0 && arr[i]<arr.length && arr[i]!=arr[correct]) {
				swap(arr, i, correct);
			}else {
				i++;
			}
		}
		
		
		for (int j = 0; j < arr.length; j++) {
			if(arr[j]!=j+1) {
				return j+1;
			}
		}
		
		return arr.length+1;
	}
	
	static void swap(int[] arr, int first, int sec) {
		int temp= arr[first];
		arr[first]  =arr[sec];
		arr[sec] = temp;
	}

	public static void main(String[] args) {
		
//		int[] arr = {7,8,9,11,12};
		int [] arr = {1,2,0};
		System.out.println(firstMissingPositive(arr));
	}

}
