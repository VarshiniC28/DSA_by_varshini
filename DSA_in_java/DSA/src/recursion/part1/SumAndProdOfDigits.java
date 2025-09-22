package recursion.part1;

public class SumAndProdOfDigits {
	
	static int sum(int n) {
		if(n == 0) return 0;
		
		return (n % 10) + sum(n / 10);
	}
	
	//product of digits
	static int product(int n) {
		if(n % 10 == n) return n;
		
		return (n % 10) * product(n / 10);
	}

	public static void main(String[] args) {

		System.out.println(sum(1234));
		
		System.out.println(product(12345));
	}

}
