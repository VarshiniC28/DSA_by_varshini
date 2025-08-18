package programming2;

public class PalindromeStringCheck {

    static void palindromeCheck(String str) {
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length - 1;

        // Reverse manually
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // Convert char[] back to String
        String reversed = new String(arr);

        if (str.equalsIgnoreCase(reversed)) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is NOT a Palindrome");
        }
    }

    public static void main(String[] args) {
        palindromeCheck("madam");
        palindromeCheck("hello");
        palindromeCheck("Racecar");
    }
}
