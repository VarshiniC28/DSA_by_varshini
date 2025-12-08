package math.programs;

import java.util.Scanner;

public class NumberBasedPrograms {
	
	//1. Input a number and print all the factors of that number 
	 static void printFactors() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number: ");
	        int n = sc.nextInt();
	        System.out.print("Factors: ");
	        for(int i=1; i<=n; i++) {
	        	if(n%i==0) System.out.print(" "+ i);
	        }
	        System.out.println();
	    }
	 
	 //2. Take integer inputs till the user enters 0 and print the sum of all numbers and print the largest number from all and print the largest
	 static void sumProductLargestUntilZero() {
	        Scanner sc = new Scanner(System.in);
	        int sum = 0;
	        int prod = 1;
	        int max= Integer.MIN_VALUE;
	        while (true) {
	            int num = sc.nextInt();
	            if (num == 0) break;
	            sum += num;
	            prod*=num;
	            if(num>max) max = num;
	        }
	        System.out.println("Sum = " + sum + ", Product = "+prod+ ", Largest = "+max);
	    }
	 
	 //3.Factorial Program In Java
	 static long factorial(int n) {
//	        Scanner sc = new Scanner(System.in);
//	        System.out.print("Enter number: ");
//	        int n = sc.nextInt();
	        long fact = 1;
	        for (int i = 1; i <= n; i++) fact *= i;
	        return fact;
	    }
	 
	 //4. Perfect number :A Perfect Number is a positive integer that is equal to the sum of its proper divisors (all divisors except the number itself).
	 //6 → divisors = 1, 2, 3 → 1 + 2 + 3 = 6 → ✅ Perfect
	 static void perfectNumber() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number: ");
	        int n = sc.nextInt();
	        int sum = 0;
	        for (int i = 1; i < n; i++) {
	            if (n % i == 0) sum += i;
	        }

	        if (sum == n)
	            System.out.println(n + " is a Perfect number.");
	        else
	            System.out.println(n + " is NOT a Perfect number.");
	    }
	 
	 //5. Average of numbers
	 static void AvgNumber() {
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter how many number: ");
	     int n = sc.nextInt();
	     int sum = 0;
	     
	     System.out.println("enetr n numbers ");
	     for(int i=1; i<=n; i++) {
	    	 sum+=sc.nextInt();
	     }
	     System.out.println((double)(sum/n));
	 }
	 
	 //npr , ncr
	 static void permutation() {
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter n: ");
	     int n = sc.nextInt();
	     System.out.print("Enter r: ");
	     int r = sc.nextInt();

	     long nPr = factorial(n) / factorial(n - r);
	     long nCr = factorial(n) / (factorial(r) * factorial(n - r));
	     System.out.println(nPr);
	     System.out.println(nCr);

	 }
	 
	public static void main(String[] args) {

//		printFactors();
//		sumProductLargestUntilZero();
//		factorial();
		perfectNumber();
		
//		AvgNumber();
//		permutation();
	}

}
