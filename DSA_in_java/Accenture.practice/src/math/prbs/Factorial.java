package math.prbs;

public class Factorial {
	
	//iterative better
	static long fact(int n) {
		if(n < 0) return -1;
		if(n ==0 || n==1) return 1;
		
		int fact = 1;
		
		for(int i=2; i<=n; i++) {
			fact*=i;
		}
		
		return fact;
	}
	
	//recursive 
	static long factorial(int n) {
		if(n<0) return -1;
		if(n==0 || n==1) return 1;

		
		return n * factorial(n-1);
	}
 

	public static void main(String[] args) {

		System.out.println(fact(3));
	}

}
