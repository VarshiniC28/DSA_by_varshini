package a.ReverseStringWords;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//
public class Reverse {

	public String solve(String A) {
		String[] words = A.trim().split("\\s+");
		List <String> wordslist = Arrays.asList(words);
		Collections.reverse(wordslist);
		return String.join(" ", words);
	}
	
	public static void main (String[] args) {
		Reverse reverse = new Reverse();
		
		System.out.println("Enter the words u want to reverse");
		Scanner scanner = new Scanner(System.in);
		String A = scanner.nextLine();
//		scanner.nextLine();
		
		System.out.println(reverse.solve(A));
	}

}


