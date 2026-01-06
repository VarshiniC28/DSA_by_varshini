package programmingLogic;

import java.util.Scanner;

public class CountNumOfWordsInSring {

	static int countOfwords(String s) {
		int count=1;
		for (int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i) == ' ' && s.charAt(i+1) != ' ') {
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  
		String s = sc.nextLine();
		
		System.out.println(countOfwords(s));
	}
}
