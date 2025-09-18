package maths.dsa2;

import java.util.ArrayList;

public class Factors {
	
	static void factors(int n) {
		
//		//O(n)
//		for (int i = 1; i <=n; i++) {
//			if(n % i == 0) System.out.println(i + " ");;
//		}
		
		//O(sqrt(n))
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 1; i <=Math.sqrt(n); i++) {
			
			if(n % i == 0) {
				if(n/i == i) {
					System.out.print(i + " ");
				}else {
					System.out.print(i + " ");
					list.add(n/i);
				}
			}
		}
		
		for (int i = list.size() - 1; i >= 0; i--) { //List will have 20 10 5 - so to print descending we are looping backward
			System.out.print(list.get(i) + " ");
		}
	}

	public static void main(String[] args) {

		factors(20);
	}

}
