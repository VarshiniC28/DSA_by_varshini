package linear.search.algorithm;

public class NumsWithEvenNoOfDigits {
	
	//Find number of numbers that have even number of digits in the array.
	public static int findNumbersWithEvenDigits(int[] nums) {
		
		int countOfEvenNums = 0;
		
		for (int i = 0; i < nums.length; i++) {
			int count = countDigits2(nums[i]);
			
			if(count%2==0) countOfEvenNums++;
		}
		return countOfEvenNums;
	}
	 
//	static int countDigits(int num) {
//		int count = 0;
//		
//		//if num is negative no. of digits will be 0, so multiply by -1
//		if(num<0) num=num*-1;
//		
//		//if num is itself zero
//		if(num==0) count = 1;
//		
//		while(num>0) {
//			count++;
//			num/=10; //176/10 = 17.6 (but its int it will store only 17) then 17/10=1.7=1  1/10 = 0.1=0
//		}
//		return count;
//	}
	
	//second way to find no of digits is: //This is the optimal way to find the num of digits
	static int countDigits2(int num) {
		if(num<0) num*=-1;
		return (int)(Math.log10(num))+1;
	}

	public static void main(String[] args) {

		int[] arr = { 12, 345, 2,64, -4896};
		System.out.println(findNumbersWithEvenDigits(arr));
	}

}
