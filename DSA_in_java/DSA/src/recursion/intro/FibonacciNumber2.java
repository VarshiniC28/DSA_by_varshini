package recursion.intro;

public class FibonacciNumber2 {
	
	static int fibonacci(int n) {
		
		if(n<2) {
			return n;
		}
		
		return (int)((Math.pow((1+Math.sqrt(5))/2, n) - Math.pow((1-Math.sqrt(5))/2, n))/Math.sqrt(5)); 
	}

	public static void main(String[] args) {
		System.out.println(fibonacci(50)); //for larger numbers like 50 we use recursion formula which is more suitable, check solution solving in book
	}
}
