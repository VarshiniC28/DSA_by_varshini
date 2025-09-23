package recursion.part1;

public class ReverseANumber1 {
	
	static int sum = 0;
	static void reverseNum(int n) {
		if(n == 0) return;
		
		int rem = n % 10;
		sum = sum * 10 + rem;
		
		reverseNum(n/10);
	}

	public static void main(String[] args) {

		reverseNum(1234);
		System.out.println(sum);
	}

}
