package pattern.programming;

public class PatternProgramming {

	public static void main(String[] args) {

		//5*5
		int n = 5;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		//---------------------------------------
//		left pyramid

		int m = 5;
		for(int i=0; i<m; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	System.out.println();
	//---------------------------------------
//	right pyramid

	int a = 5;
	for(int i=0; i<a; i++) {
		for(int j=0; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}

}
