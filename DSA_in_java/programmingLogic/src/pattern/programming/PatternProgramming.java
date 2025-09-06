package pattern.programming;

import java.util.Iterator;

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
		//spaces
		for (int k = 0; k < a-i; k++) {
			System.out.print(" ");
		}
		
		for(int j=0; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	System.out.println();
	//---------------------------------------------
	
	//reverse left pyramid
	int b = 4;
	for (int i = 0; i < b; i++) {
		for (int j = 0; j < b-i; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	System.out.println();
	
	//--------------------------------------------
	
//	left pyramid number
	int c = 5;
	for (int i = 0; i < c; i++) {
		for (int j = 0; j <=i; j++) {
			System.out.print(j+1 + " ");
		}
		System.out.println();
	}
	System.out.println();
	
	//------------------------------------
	
	int d = 5;
	for(int i=0; i<d*2; i++) {
		int totalColsInRow = i>d ? 2*d - i : i;
		for(int j=0; j<totalColsInRow; j++) {
			System.out.print("*");
		}		
		System.out.println();
	}
	
	//-----------------------------------
	
	//diamond
	
	int e = 5;
	for(int i=0; i<e*2; i++) {
		int totalColsInRow = i>e ? 2*e - i : i;
		int totalSpaces = n - totalColsInRow;
		for (int k = 0; k < totalSpaces ; k++) {
			System.out.print(" ");
		}
		for(int j=0; j<totalColsInRow; j++) {
			System.out.print("* ");
		}		
		System.out.println();
	}
	
	
	//---------------------------------------------------
	
	int f = 5;
	for (int i = 1; i <= f; i++) {
		
		for (int k = 0; k < f-i; k++) {
			System.out.print("  ");
		}
		
		for (int j = i; j >= 1 ; j--) {
			System.out.print(j + " ");
		}
		for (int j = 2; j <= i ; j++) {
			System.out.print(j + " ");
		}
		
		System.out.println();
	}
	
	//-----------------------------------------------------
	
	
}

}
