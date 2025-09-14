package maths.dsa;

//Given array . every numbers appear twice and only onr number appears once

public class FindNoAppearedOnce {

	 static int ans(int[] arr) {
	        int unique = 0;   // start with 0, because XOR with 0 keeps the number as it is

	        // Go through each number in the array
	        for (int n : arr) {
	            // XOR the current number with 'unique'
	            // Why? -> If the number appeared twice, XOR will cancel it out (n ^ n = 0)
	            // If it appears only once, it will remain in 'unique'
	            unique = unique ^ n;
	        }

	        // After the loop finishes, 'unique' will contain the number that appeared only once
	        return unique;
	    }

	    public static void main(String[] args) {
	        // Array where every number appears twice, except one number
	        int[] arr = {2, 3, 3, 4, 1, 2, 1, 6, 4};

	        // Call the function and print the result
	        // Expected: 6 (because 6 has no pair, all others cancel out)
	        System.out.println(ans(arr));
	    }

}
