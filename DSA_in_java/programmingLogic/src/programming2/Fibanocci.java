package programming2;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {

		//Fibonacci Series till given n number:
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ENter n till  u want FibonacciSeries: ");
		int n = sc.nextInt();
		
		int a = 0 , b =1;
		for (int i = 0; i < n; i++) {
			System.out.println(a + " ");
			int next = a+b;
			a= b;
			b = next;
		}
		
		sc.close();
	}

}
