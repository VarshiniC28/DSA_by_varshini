package programming2;

import java.util.Scanner;

public class RupeesToUSD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount in Rupees: ");
        double rupees = sc.nextDouble();

        double usdRate = 84.5; // Example rate: 1 USD = 84.5 INR
        double usd = rupees / usdRate;

        System.out.printf("Amount in USD = %.2f", usd);
        sc.close();
	}

}
