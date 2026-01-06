package array.dsa;

public class SecondLargestNumberInArray {

	//Using Selection algorithm
	static int secondLargest(int[] arr) {
		if(arr.length < 2) return -1;
		
		int largest = Integer.MIN_VALUE;
		int secLargest = Integer.MIN_VALUE;
		
		for (int num : arr) {
			if(num > largest) {
				secLargest = largest;
				largest = num;
			}else if(num > secLargest && secLargest != largest) {
				secLargest = num;
			}
		}
		
		return secLargest;
	}
	
	static int secondSmallest(int[] arr) {
		if(arr.length < 2) return -1;
		
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		for (int num : arr) {
			if(num < smallest) {
				secondSmallest = smallest;
				smallest = num;
			}else if(num < secondSmallest && secondSmallest != smallest) {
				secondSmallest = num;
			}
		}
		
		return secondSmallest;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {3,10,5,2};
		System.out.println(secondLargest(arr));
		System.out.println(secondSmallest(arr));
	}
}
