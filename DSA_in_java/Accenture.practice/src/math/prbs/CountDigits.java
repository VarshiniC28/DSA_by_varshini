package math.prbs;

public class CountDigits {
	
	static int count(int num) {
		//one line
//		return (int)(Math.log10(num) + 1);
		
		 if (num == 0) return 1;
		
		int count = 0;
		while(num > 0) {
			count++;
			num = num/10;
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count(1234567891));
	}

}
