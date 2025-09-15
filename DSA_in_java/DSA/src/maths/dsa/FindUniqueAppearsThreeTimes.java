package maths.dsa;

public class FindUniqueAppearsThreeTimes {
	
	static int ans(int[] arr) {
		
		int result = 0;
		
		for (int i = 0; i < 32; i++) { //32 bits
				int bitCount = 0;
				
				for(int n: arr) {
					if(((n>>i)&1) == 1) {
						bitCount++;
					}
				}
				
				if(bitCount % 3 != 0) {
					result |= (1 << i);
				}
		}
		
		return result;
	}

	public static void main(String[] args) {

		//Given array has numbers that appear 3 times then find the one that occur once
//		int [] arr = {2,2,3,2,7,7,8,7,8,8};
		int [] arr = {2,2,2,7,7,8,7,8,8,4};
		System.out.println(ans(arr));
	}

}
