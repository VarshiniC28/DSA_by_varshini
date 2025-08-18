package programming2;

import java.util.Scanner;

class PalindromeStringMethod {
    static void p() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        String str = String.valueOf(n);       // convert number to string
        String rev = new StringBuilder(str).reverse().toString(); // reverse string

        if (str.equals(rev)) System.out.println(n + " is a Palindrome");
        else System.out.println(n + " is NOT a Palindrome");
    }
}

public class PalindromeNumberCheck {
	
	 static void palindromeNumber() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number: ");
	        int n = sc.nextInt();
	        int original = n, rev = 0;

	        while (n > 0) { //454 >0 , 45>0, 4>0
	            rev = rev * 10 + (n % 10); //0*10+4 = 4   //4*10+5 = 45 //45*10+4 = 454 
	            n /= 10; //45 //4 
	        }

	        if (rev == original)
	            System.out.println(original + " is a Palindrome.");
	        else
	            System.out.println(original + " is NOT a Palindrome.");
	    }

	public static void main(String[] args) {
		palindromeNumber();
		PalindromeStringMethod.p();
	}

}
