package array.slidingwindow;

public class MaxSumOfSubArrayOfSizeK {

    static int maxSum(int[] arr, int k) {
    	
    	 if (k <= 0 || k > arr.length) {
             return 0;
         }
    	
        int wSum = 0;

        // Step 1: First window sum
        for (int i = 0; i < k; i++) {
            wSum += arr[i];
        }

        // Step 2: Initialize max sum
        int mSum = wSum;

        // Step 3: Slide the window
        for (int i = k; i < arr.length; i++) {
            wSum = wSum - arr[i - k] + arr[i];
            mSum = Math.max(mSum, wSum);
        }

        return mSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 9, 31, -4, 21, 7};
        System.out.println(maxSum(arr, 3));
    }
}
