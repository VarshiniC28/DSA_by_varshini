package programming2;

import java.util.Scanner;

public class DiffOfProductndSumOfDigits {

//	Given an integer number n, return the difference between the product of its digits and the sum of its digits.
	static int subtractProductAndSum(int n) {
        int sum = 0;
        int product =1;
        while(n>0){
            sum+=n%10;
            product*=n%10;
            n/=10;
        }
        return product-sum;
    }
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a integer: ");
		int n = sc.nextInt();	
		System.out.println(subtractProductAndSum(n));
	}

}
