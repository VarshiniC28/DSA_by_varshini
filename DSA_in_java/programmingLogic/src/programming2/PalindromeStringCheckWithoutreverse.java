package programming2;

public class PalindromeStringCheckWithoutreverse {

    static void palindromeCheck(String str1) {
    	String str = str1.toLowerCase();
    	int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                System.out.println(str + " is NOT a Palindrome");
                return;
            }
            start++;
            end--;
        }
        System.out.println(str + " is a Palindrome");
    }

    public static void main(String[] args) {
        palindromeCheck("madam");
        palindromeCheck("hello");
        palindromeCheck("Racecar");
    }
}
