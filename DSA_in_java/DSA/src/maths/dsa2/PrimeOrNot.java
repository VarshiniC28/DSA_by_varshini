package maths.dsa2;

public class PrimeOrNot {
	
	static boolean isPrime(int n) {
		if(n<=1) return false;
		
//		int s = 2;
//		while( s*s <= n) { //this means s <= Math.sqrt(n)
//			if(n % s == 0) return false;
//			s++;
//		}
//		return true;
		
		//Or
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) return false;
		}
		
		return true;
		
	}

	public static void main(String[] args) {

		int n = 20;
		
		for (int i = 1; i <= n; i++) {
			System.out.println(i + " " + isPrime(i));
		}
	}

}
