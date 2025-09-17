package maths.dsa;

//Find XOR of numbers from 0 to a

public class XORofNosFrom0Toa {

	static int xor(int a) {
		
		if(a % 4 == 0) return a;
		if(a % 4 == 1) return 1;
		if(a % 4 == 2) return a+1;
		if(a % 4 == 3) return 0;
		
		return -1;
	}
	
	public static void main(String[] args) {

		System.out.println(xor(0));
	}

}
