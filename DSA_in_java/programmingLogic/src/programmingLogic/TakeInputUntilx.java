package programmingLogic;

import java.util.Scanner;

public class TakeInputUntilx {

	public static void main(String[] args) {

		 	Scanner sc = new Scanner(System.in);
	        int sum = 0;

	        while (true) {
	            System.out.print("Enter a number (or 'x' to stop): ");
	            String input = sc.next();

	            if (input.equalsIgnoreCase("x")) {
	                break;
	            }

	            try {
	                int num = Integer.parseInt(input);
	                sum += num;
	            } catch (NumberFormatException e) {
	                System.out.println("Invalid input, please enter a number or 'x'.");
	            }
	        }

	        System.out.println("Sum of all numbers = " + sum);
	        sc.close();
	}

}
