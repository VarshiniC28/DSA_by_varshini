package array.dsa;

public class MissingNumber1ToN {
	
	//sum formula method: ( can also use cyclic sort method
	static int miss(int[] arr) {
		int n = arr.length+1; //for 1 to n use arr.length+1, if 0 to n arr.length
		
		int sumUptoN = n*(n+1)/2;
		int actualSum = 0;
		
		for(int num : arr) {
			actualSum+=num;
		}
		
		return sumUptoN - actualSum;
	}
	
	
	//or
	static int missingNumber(int[] nums) {
	    int xor = 0;
	    int n = nums.length;

	    for (int i = 0; i <= n; i++) {
	        xor ^= i;
	    }
	    for (int num : nums) {
	        xor ^= num;
	    }

	    return xor;
	}


	public static void main(String[] args) {

		int [] arr = {1,2,4,5};
		System.out.println(miss(arr));
	}

}
