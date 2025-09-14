package maths.dsa;

public class EvenOrOdd {
	
	static void evenOrOdd(int num) {
		if((num&1)==1) { //if the binary form of num has 1 at last it is odd, and if it is 0 it is even
			System.out.println("Number is odd"); //so 1 & num ans is 1 itself, so if the num & 1 give us 1 , it means the num has 1 at end so it is odd.
		}else System.out.println("Number is even"); //if num & 1 gives us 0 - then it is even 
	}

	public static void main(String[] args) {
		
		evenOrOdd(1);
	}

}
