package programmingLogic;

import java.util.Scanner;
/*
3. Reverse Words in a Sentence
Take a string input and reverse each word individually without changing the order of words.
Example: "Hello World" → "olleH dlroW"*/

class ReverseSentence{
	
	public String ReversEachWord(String s) {
		String[] word = s.split(" ");
		
		StringBuilder res = new StringBuilder();
		
		for(String w : word) {
			String reversed = new StringBuilder(w).reverse().toString();
			res.append(reversed).append(" ");
		}
		
		return res.toString().trim();
	}
}

public class ReverseWordInSentence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String s = sc.nextLine();
		
		ReverseSentence reverse = new ReverseSentence();
		String op = reverse.ReversEachWord(s);
		
		System.out.println(op);
		
	}

}
