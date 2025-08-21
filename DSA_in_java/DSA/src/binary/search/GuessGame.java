package binary.search;

import java.util.Scanner;

//374. Guess Number Higher or Lower
/*
 * We are playing the Guess Game. The game is as follows:I pick a number from 1 to n. You have to guess which number I picked.
 * Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
 * You call a pre-defined API int guess(int num), which returns three possible results:
 * -1: Your guess is higher than the number I picked (i.e. num > pick).
 * 1: Your guess is lower than the number I picked (i.e. num < pick).
 * 0: your guess is equal to the number I picked (i.e. num == pick).
 * Return the number that I picked.

Example 1:
Input: n = 10, pick = 6
Output: 6
 * */

public class GuessGame {
	static int pickedNumber;

    // Simulated LeetCode API
    static int guess(int num) {
        if (num == pickedNumber) return 0;   // correct
        if (num > pickedNumber) return -1;   // guess is too high
        return 1;                            // guess is too low
    }
	
	static int guessGame(int n) {
		int start=1;
		int end = n;
		while(start<=end) {
			int num = start+(end-start)/2;
			if(guess(num)==0) return num;
			else if(guess(num)==-1) end=num-1;
			else if(guess(num)==1) start=num+1;
		}
		
		return start;
	}

	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
        System.out.print("Pick a number between 1 to n: ");
        pickedNumber = sc.nextInt();

//        int n = 10; // upper bound, can be changed
        System.out.println("Guessed number: " + guessGame(10));
	}

}
