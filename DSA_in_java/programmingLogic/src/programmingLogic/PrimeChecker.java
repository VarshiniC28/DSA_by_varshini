package programmingLogic;

import java.util.Arrays;
import java.util.Scanner;

/*
    2. Prime Checker for Range
    Write a program that takes an integer N and prints numbers from 1 to N,
    but replaces:
    - Prime numbers with "Prime"
    - Non-prime numbers with "Not Prime"
*/
class PrimeCheck {
    
	public String[] prime(int N) {
		String[] res = new String[N];
		
		for(int i = 1; i<=N; i++) {
			if(isPrime(i)) {
				res[i-1] = "Prime"; //shifts index by -1, since we start form 1 to N
			}else {
				res[i-1] = "Not prime";
			}
		}
		
		return res;
	}
	
	boolean isPrime (int num) {
		if (num < 2) return false; 
		
		for(int i=2; i<=Math.sqrt(num); i++) {
			if(num%i==0) return false; //not prime since it has divisor
		}
		
		return true; //prime
	}
}

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int N = sc.nextInt();
        
        PrimeCheck p = new PrimeCheck();
        String[] op = p.prime(N);
        
        System.out.println(Arrays.toString(op));
        
    }
}
