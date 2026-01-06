package array.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class MaxSumOfSubArrayWithNoDuplicatesOfSizeK {

    static long maximumSubarraySum(int[] arr, int k) {
    	
    	long wSum = 0;
        long mSum = 0;

        Set<Integer> set = new HashSet<Integer>();

        int i = 0; //start of window
        for(int j= 0; j<arr.length; j++){ //j last of window

            //if already in set remove 1st element of window and also from sum, and i++ to move window
            while(set.contains(arr[j])){
                set.remove(arr[i]);
                wSum-=arr[i];
                i++;
            }

            //Add current element if not in set
            set.add(arr[j]);
            wSum+=arr[j];

            //if wdw size becomes k, check max sum and move the window, and remove prev i element from set
            if(j - i + 1 == k){
                mSum = Math.max(mSum, wSum);
                set.remove(arr[i]);
                wSum-=arr[i];
                i++;
            }
        }
        return mSum;
    	
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 2, 9, 9, 9};
        System.out.println(maximumSubarraySum(arr, 3));
    }
}
