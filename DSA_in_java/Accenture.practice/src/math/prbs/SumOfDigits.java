package math.prbs;


public class SumOfDigits {
	
	static int sum(int num) {
		
		if(num==0) return 0;
		
		int sum = 0;
		
		while(num>0) {
			sum += num % 10;
			num/=10;
		}
		
		return sum;
	}
	
	static int rev(int num) {
		
		int rev = 0;
		
		while(num > 0) {
			rev = rev * 10 + num % 10;
			num=num/10;
		}
		
		return rev;
	}
	
	public static void main(String[] args) {
	
		System.out.println(sum(123456789));
	}
}
