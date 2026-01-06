package array.dsa;

public class KadanesAlgo {

	//max subarray
	
	static int maxsum(int[] arr) {
		int max = Integer.MIN_VALUE;
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			
			if(sum>max) max = sum;
			
			if(sum<0) sum=0;
		}
		
		return max;
	}
	
    static void maxSubArray(int[] arr) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        int start = 0;
        int ansStart = 0;
        int ansEnd = 0;

        for (int i = 0; i < arr.length; i++) {

            if (sum == 0) {
                start = i;
            }

            sum += arr[i];

            if (sum > max) {
                max = sum;
                ansStart = start;
                ansEnd = i;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        // Print result
        System.out.println("Maximum Sum = " + max);
        System.out.print("Subarray: ");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
	public static void main(String[] args) {
		
		int[] arr = {-2,-3,4,-1,-2,1,5,-3};
		System.out.println(maxsum(arr));
	}
}
