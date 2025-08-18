package math.programs;

import java.util.Scanner;

public class MiscellaneousProblems {
	
    // 1. Distance between two points
    static void distanceBetweenPoints() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1, y1: ");
        double x1 = sc.nextDouble(), y1 = sc.nextDouble();
        System.out.print("Enter x2, y2: ");
        double x2 = sc.nextDouble(), y2 = sc.nextDouble();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distance = " + distance);
    }

 // 2. Leap year check
    static void leapYearCheck() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
            System.out.println(year + " is a Leap Year");
        else
            System.out.println(year + " is NOT a Leap Year");
    }

    // 3. Kunal allowed on even days in August
    static void kunalAllowed() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day of August: ");
        int day = sc.nextInt();

        if (day >= 1 && day <= 31) {
            if (day % 2 == 0)
                System.out.println("Kunal is allowed on day " + day);
            else
                System.out.println("Kunal is NOT allowed on day " + day);
        } else {
            System.out.println("Invalid day of August!");
        }
    }

    // 4. Sum of negatives, evens, odds until 0
    static void sumCategories() {
        Scanner sc = new Scanner(System.in);
        int negSum = 0, evenSum = 0, oddSum = 0;

        System.out.println("Enter numbers (0 to stop): ");
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;

            if (n < 0) negSum += n;
            else if (n % 2 == 0) evenSum += n;
            else oddSum += n;
        }
        System.out.println("Sum of negatives = " + negSum);
        System.out.println("Sum of positive evens = " + evenSum);
        System.out.println("Sum of positive odds = " + oddSum);
    }

    // 5. Electricity bill
    static void electricityBill() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();
        double bill = 0;

        if (units <= 100) bill = units * 1.20;
        else if (units <= 300) bill = 100 * 1.20 + (units - 100) * 2;
        else bill = 100 * 1.20 + 200 * 2 + (units - 300) * 3;

        System.out.println("Electricity Bill = ₹" + bill);
    }

    // 6. Discount of product
    static void discountProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product price: ");
        double price = sc.nextDouble();
        System.out.print("Enter discount %: ");
        double discount = sc.nextDouble();

        double finalPrice = price - (price * discount / 100);
        System.out.println("Final Price after discount = ₹" + finalPrice);
    }

    // 7. Commission percentage
    static void commissionCalc() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total sales: ");
        double sales = sc.nextDouble();
        System.out.print("Enter commission %: ");
        double rate = sc.nextDouble();

        double commission = (sales * rate) / 100;
        System.out.println("Commission = ₹" + commission);
    }

    // 8. Depreciation value
    static void depreciationCalc() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial value: ");
        double value = sc.nextDouble();
        System.out.print("Enter depreciation % per year: ");
        double rate = sc.nextDouble();
        System.out.print("Enter years: ");
        int years = sc.nextInt();

        double depreciatedValue = value * Math.pow((1 - rate / 100), years);
        System.out.println("Value after depreciation = ₹" + depreciatedValue);
    }

    // 9. Compound Interest
    static void compoundInterest() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter Rate of interest: ");
        double r = sc.nextDouble();
        System.out.print("Enter Time (years): ");
        int t = sc.nextInt();
        System.out.print("Enter compounding frequency per year: ");
        int n = sc.nextInt();

        double amount = p * Math.pow((1 + r / (100 * n)), n * t);
        double ci = amount - p;
        System.out.println("Compound Interest = ₹" + ci);
    }

    // 10. Future Investment Value
    static void futureInvestment() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Investment amount: ");
        double amount = sc.nextDouble();
        System.out.print("Enter Annual Interest Rate (%): ");
        double rate = sc.nextDouble();
        System.out.print("Enter Years: ");
        int years = sc.nextInt();

        double futureValue = amount * Math.pow(1 + rate / 100, years);
        System.out.println("Future Investment Value = ₹" + futureValue);
    }
    
	public static void main(String[] args) {
		distanceBetweenPoints();
	}
}
