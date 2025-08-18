package math.programs;

public class SumofNnaturalnumbers {
    static int sumN(int n) {
        return n * (n + 1) / 2; // formula
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Sum of first " + n + " numbers = " + sumN(n));
    }
}
