package math.programs;
import java.util.Scanner;

public class MaxMin {
	
	static int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    static int minOfThree(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        System.out.println("Maximum: " + maxOfThree(a, b, c));
        System.out.println("Minimum: " + minOfThree(a, b, c));

	}
}
