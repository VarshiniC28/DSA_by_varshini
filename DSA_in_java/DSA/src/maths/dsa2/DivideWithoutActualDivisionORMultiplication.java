package maths.dsa2;

public class DivideWithoutActualDivisionORMultiplication {
	
	 static int divide(int dividend, int divisor) {

	        if(dividend == divisor) return 1;

	        boolean posSign = true;

	        if(dividend >= 0 && divisor < 0) posSign = false;
	        else if(dividend <=0 && divisor > 0) posSign = false;

	        //remove -ve since we will add -ve sign based on the condition check that we did above use Math.abs
	        long n = Math.abs((long)dividend);
	        long d = Math.abs((long)divisor);

	        long q = 0; //quotient

	        while(n >= d){
	            int cnt = 0;
	            while(n >= (d << (cnt+1))) cnt+=1; //n >= d * 2^cnt+1
	            q+=(1<<cnt);
	            n-=(d << cnt); //n-3*d^cnt //22-10 //10-6 //4- 3
	        }
	        
	        //handling overflow since range is -2^31 to 2^31 - 1
	        if(q == (1<<31) && posSign){ //this means 2^31
	            return Integer.MAX_VALUE;
	        }

	        if(q == (1<<31) && !posSign){ //-2^31
	            return Integer.MIN_VALUE;
	        }

	        //adding signs at last
	        return posSign ? (int)q : (int)-q;

	 }
	 
	public static void main(String[] args) {

		System.out.println(divide(10, 3));
		System.out.println(divide(22, 3));
	}

}
