package maths.dsa2;

public class BinarySeacrhSqrtOfNumber {
	
	static double sqrt(int n, int p) { //p - precision
		int s = 1;
		int e = n;
		
		double root = 0.0; //ans
		
		while(s<=e) {
			int m = s + (e - s) / 2;
			if(m*m==n) return m;
			else if(m*m>=n) e = m-1;
			else s = m+1;
		}
		
		root =  e;
		
		//now to add the decimal points for exact answer
		
		double incr = 0.1;
		for (int i = 0; i < p; i++) {
			while(root * root <= n) {
				root+=incr;
			}
			root-=incr;
			incr/=10; //(for 0.01 precision
		}
		
		return root;
		
	}

	public static void main(String[] args) {
		
		System.out.println(sqrt(40, 3));
		
		//Time complexity : O(log(n))
	}

}
