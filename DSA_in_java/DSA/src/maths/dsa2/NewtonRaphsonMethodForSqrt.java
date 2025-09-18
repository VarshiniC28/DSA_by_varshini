package maths.dsa2;

//Newton raphson method for sqrt of a number

public class NewtonRaphsonMethodForSqrt {
	
	static double sqrt(int n) {
		double x = n;
		
		double root = 0.0;
		
		while(true) {
			root = 0.5 * (x + (n/x));
			if(Math.abs(root-x) < 0.5) break;
			
			x = root;
		}
		
		return root;
	}

	public static void main(String[] args) {

		System.out.println(sqrt(40));
	}

}
