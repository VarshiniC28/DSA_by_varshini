package programmingLogic;

import java.util.Scanner;

/*4. Armstrong Number Finder
Find all Armstrong numbers between 1 and a given number N.
(An Armstrong number is one whose sum of its own digits raised to the power of the number of digits equals the number itself.)*/

//72 - 7^2 + 9^2 = 49 + 81 -> not equal to 72 - not Armstrong number
//153 -> 1^3 + 5^3 + 3^3 = 1+125+27 = 153 - Armstrong number 
//Other egs - 370 371 407 1634 8208 9474...

class FindArmStrong{
	
	//to check if arm - num is each number not N
	boolean find(int num) {
		
//			String s = new String(String.valueOf(num)); //takes time and space so create count method as below
//			int count = s.length();
			int count = count(num);
			int originalNum = num;
			
			int sum = 0;
			
			while(num>0) {
				int eachDigit = num%10; //%10 gets last digit
				sum+=Math.pow(eachDigit, count);
				num /=10; //  /10- removes last digit
			}
			
			if(sum == originalNum) {
				return true;
			}
			return false;
	}
	
	
	int count(int num) {
		int count = 0;
		int temp = num;
		while(temp>0) {
			temp/=10;
			count++;			
		}
		
		return count;
	}
}


public class AmstrongNumberFinder {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter N to find armstrin numbers between 1 to N: ");
		int N = sc.nextInt();
		
		FindArmStrong arm = new FindArmStrong();
		
		for(int i=1; i<=N; i++) {
			if(arm.find(i)) {
				System.out.print(i+ " "); //1, 2, 3, 4, 5, 6, 7, 8, 9 are Armstrong numbers by definition.- since number of digits = 1 -> 5^1 =5
			}
		}
	}

}
