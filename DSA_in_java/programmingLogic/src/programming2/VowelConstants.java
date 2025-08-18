package programming2;

import java.util.Scanner;

public class VowelConstants {

	static void VowelConstant() {
		  	Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a character: ");
	        char ch = sc.next().charAt(0);

	        if ("AEIOUaeiou".indexOf(ch) != -1)
	            System.out.println(ch + " is a Vowel");
	        else if (Character.isLetter(ch))
	            System.out.println(ch + " is a Consonant");
	        else
	            System.out.println("Not an alphabet");
	    }
	
	public static void main(String[] args) {

		VowelConstant();
	}

}
