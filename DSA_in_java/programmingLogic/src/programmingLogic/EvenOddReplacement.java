	package programmingLogic;

import java.util.Scanner;

/*
		1. Even-Odd Replacement
		Write a program that takes an integer N and prints numbers from 1 to N, but replaces:
		Multiples of 2 with "Even"
		Multiples of 3 with "Odd"
		Multiples of both 2 and 3 with "EvenOdd"*/
	class EvenOdd{
		
		void solution(int N) {
	
			for(int i=1; i<=N; i++) {
				if(i%2==0 && i%3==0) {
					System.out.println("EvenOdd");
					continue;
				}else if(i%2==0) {
					System.out.println("Even");
					continue;
				}else if(i%3==0) {
					System.out.println("Odd");
					continue;
				}
				System.out.println(i);
			}
			
		}
	}
	
	public class EvenOddReplacement {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter N: ");
			int N = sc.nextInt();
			
			EvenOdd e = new EvenOdd();
			e.solution(N);
		}
	}
