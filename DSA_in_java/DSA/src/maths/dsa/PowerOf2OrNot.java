package maths.dsa;

public class PowerOf2OrNot {

	public static void main(String[] args) {
		
		int n = 16;
		int bitCount = 0;
		
		for(int i=0; i<32; i++) {
			
//			while(n>0) {
				if(((n>>i)&1) == 1){
					bitCount++;
				}
//			}
		}
		
		if(bitCount==1) System.out.println("Given number is power of 2");
		else System.out.println("Number is not  a power of 2");
		
		
		
		//-------------------------OR------------------------------------
		
		
		//Another simple method is :
		int m = 10 ;
		if((m & (m-1)) == 0) System.out.println("Given number is power of 2");
		else System.out.println("Given number is not power of 2");
	}
}
