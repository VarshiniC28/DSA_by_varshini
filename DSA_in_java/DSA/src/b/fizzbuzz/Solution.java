package b.fizzbuzz; 
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public String[] fizzbuzz(int A) {
        String[] result = new String[A];
        for (int i = 0; i < A; i++) {
            int num = i + 1;
            if (num % 15 == 0) {
                result[i] = "FizzBuzz";
            } else if (num % 3 == 0) {
                result[i] = "Fizz";
            } else if (num % 5 == 0) {
                result[i] = "Buzz";
            } else {
                result[i] = String.valueOf(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
    	System.out.println("Enter the number you want to check till for fizzbuzz: ");
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt(); 
        Solution solution = new Solution();
        String[] output = solution.fizzbuzz(A);
        System.out.println(Arrays.toString(output));
        
        scanner.close(); 
    }
}
