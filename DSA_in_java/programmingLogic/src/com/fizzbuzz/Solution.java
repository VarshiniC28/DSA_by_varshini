package com.fizzbuzz; 

import java.util.Arrays;
import java.util.Scanner;

/*
    QUESTION:
    Write a program that takes an integer A as input and generates a list of strings 
    representing numbers from 1 to A, replacing:
      - Multiples of 3 with "Fizz"
      - Multiples of 5 with "Buzz"
      - Multiples of both 3 and 5 with "FizzBuzz"
    The program should then print the sequence as an array.

    Example:
    Input: 5
    Output: [1, 2, Fizz, 4, Buzz]

    Input: 15
    Output: [1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]
*/

public class Solution {

    public String[] fizzbuzz(int A) {
    	
    	String[] res = new String[A];
    	for(int i=0; i<	A; i++) {
    		int num = i+1;
    		if(num%3 ==0 && num%5==0) {
    			res[i] = "FizzBuzz";
    		}else if(num%3==0) {
    			res[i] = "Fizz";
    		}else if(num%5==0){
    			res[i] = "Buzz";
    		}else {
    			res[i] = String.valueOf(num);
    		}
    	}
    	
    	return res;
   }

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Enter the number: ");
    	int A = sc.nextInt();
    	
    	Solution sol = new Solution();
    	String[] op = sol.fizzbuzz(A);
    	
    	System.out.println(Arrays.toString(op)); // Converts the String[] array into a readable string format like [1, 2, Fizz, 4, Buzz]
    	
     }
}
