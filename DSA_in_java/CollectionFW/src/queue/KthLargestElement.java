package queue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElement {
	
	static int findKthLargest(int[] nums, int k) {
		
		//TC : O(n log n) , SC : O(1) - In place //but does more work then needed
//		Arrays.sort(nums);              // sort entire array in ascending order
//		return nums[nums.length - k];   // pick the k-th largest element from the end
		
//		or
		
		//TC : O(n log k) , SC : O(k) //optimal
		PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // min-heap (smallest on top)

		for (int num : nums) {
		    minHeap.offer(num);        // add current number to heap

		    if (minHeap.size() > k) {
		        minHeap.poll();        // remove smallest → keep only k largest elements
		    }
		}

		return minHeap.peek();         // smallest among k largest = k-th largest

	}

	public static void main(String[] args) {

//		1️. PriorityQueue always gives the smallest element first
//		In Java, peek() and poll() return the smallest number, not sorted order.
//
//		2️. It is NOT sorted
//		Inside the queue, numbers can look jumbled.
//		Only one rule is guaranteed: smallest stays on top.
//
//		3️. Used when you only care about the “best” element
//		Best = smallest (min-heap) or largest (if you reverse it).
//		Not for full sorting.
		
		int[] nums = {3, 6, 7, 10};
		System.out.println(findKthLargest(nums, 4)); //4th largest is 3
	}

}
