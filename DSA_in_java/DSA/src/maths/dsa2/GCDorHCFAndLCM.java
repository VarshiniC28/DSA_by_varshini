package maths.dsa2;

public class GCDorHCFAndLCM {
	
	//using recursion
	static int gcd(int a, int b) {
		
		//base condition : recursion ends when this condition is achieved
		if(a == 0) return b;
		
		return gcd(b % a , a); //recursion call - recursive relation
		
	}
	
	static int lcm(int a, int b) {
		
		return a * b / gcd(a, b);
	}
	

	public static void main(String[] args) {
		
		System.out.println("HCF: " + gcd(9,18));
		
		System.out.println("LCM: " + lcm(9,18));
	}
}
