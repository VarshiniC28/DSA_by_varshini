 package binary.search;

public class SquareRoot {
	
	static int sqrt(int x) {
		if(x<2) return x;
		
		int s = 1;
		int e = x/2;
		int ans=0;
		
		while(s<=e) {
			int mid = s+(e-s)/2;
			long square= (long) mid*mid;
			
			if(square==x) {
				return mid;
			}else if(square<x) {
				ans=mid; //storing mid that can be floor if exact sqrt not found
				s=mid+1;
			}else if(square>x) {
				e=mid-1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {

		System.out.println(sqrt(36));
	}

}
