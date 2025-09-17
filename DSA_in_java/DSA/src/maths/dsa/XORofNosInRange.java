package maths.dsa;

//Find XOR of numbers from a to  b -in range

public class XORofNosInRange {

	//XOR till a
	static int xor(int a) {
		
		if(a % 4 == 0) return a;
		if(a % 4 == 1) return 1;
		if(a % 4 == 2) return a+1;
//		if(a % 4 == 3) return 0; //directly return 0 is given below which is this line alternate
		
		return 0;
	}
	
	public static void main(String[] args) {

		//Range xor for a, b = xor(b) - xor(a-1);
		int a = 3;
		int b = 9;
		int ans = xor(b) ^ xor(a-1); //cancels out the extras from 0 to a-1 
		System.out.println(ans);
		
		
		//-------------------------------------------------------------------------------------
		
		//Only for check - will give time lapse error(TLE) - since it takes lot of time
		int ans2 = 0;
		for (int i = a; i <= b; i++) {
			ans2 ^= i;
		}
		
		System.out.println(ans2);
	}

}
