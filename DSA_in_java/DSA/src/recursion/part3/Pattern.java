package recursion.part3;

public class Pattern {

	static void triangle(int i, int j) {
		if(i == 0) return;
		
		if(j < i) {
			System.out.print("* ");
			triangle(i, j+1);
		}else {
			System.out.println();
			triangle(i - 1, 0);
		}
	}
	
	static void triangle2(int i, int j) {
		if(i == 0) return;
		
		if(j < i) {
			triangle2(i, j+1);
			System.out.print("* ");
		}else {
			triangle2(i-1, 0);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {

//		int n = 4;
//		for(int i=0; i<=n; i++) {
//			for (int j = 0; j < n-i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		//----------------------------------------
		
		triangle(4, 0);
		
		//----------------------------------------
		
		triangle2(4	,0);
	}
	


}
