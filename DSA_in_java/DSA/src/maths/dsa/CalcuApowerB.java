package maths.dsa;

public class CalcuApowerB {

	public static void main(String[] args) {

		int base = 3; //a
		int power = 6; //b
		
		int ans = 1;
		
		while(power>0) {
			if((power & 1) == 1) {
				ans *= base ;
			}
			
			base *= base;
			power = power >> 1;
		}
		
		System.out.println(ans); // 3^6 = 729
	}

}
