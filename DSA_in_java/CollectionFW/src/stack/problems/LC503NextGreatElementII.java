package stack.problems;

import java.util.Arrays;
import java.util.Stack;

//LC: 503 Next Greater Element ||
//Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is nums[0]), 
//return the next greater number for every element in nums.
//
//The next greater number of a number x is the first greater number to its traversing-order next in the array, 
//which means you could search circularly to find its next greater number. If it doesn't exist, return -1 for this number.
//
//Example 1:
//Input: nums = [1,2,1]
//Output: [2,-1,2]

public class LC503NextGreatElementII {
	
	static int[] nextGreat(int[] nums) {
        int n = nums.length;
        int[] res = new int[nums.length];
        Arrays.fill(res , -1);

        Stack<Integer> st = new Stack<>();//stores indices of arr which has not get nxt great num yet

        // same as next greatest element 1 expect its circular array
        //hence loop goes till 2 * n, and as we loop curr elements index being i % n
        //as usual we use %  (as i % n - return i)

        for(int i = 0 ; i < 2 * n; i++){
            int curr = nums[i % n];

            while(!st.isEmpty() && curr > nums[st.peek()]){
                res[st.pop()] = curr;
            }

            if(i < n){
                st.push(i); //because the i goes till 2 * n
            }
        }

        return res;
	}

	public static void main(String[] args) {

		int[] arr = {1,2,1};
		System.out.println(Arrays.toString(nextGreat(arr)));
	}

}
