package math.prbs;

public class CheckPrime {
	
	static boolean check(int n) {
		
		if(n <= 1) return false;
		
		if(n == 2 || n == 3) return true;
		
		if(n % 2 == 0) return false;
		
		for(int i = 3; i < (int)(Math.sqrt(n)); i++){
			if(n % i == 0) {
				return false;
			}
		}
		
		return true; 
	}

	//print all primes till n 
	
	
	public static void main(String[] args) {

		System.out.println(check(22));
	}

}
