package strings.buffer.builder;

public class PalindromeString {
	
	static boolean isPalindrome(String s) {
		if(s == null || s.length()==0) {
			return true;
		}
		
		s = s.toLowerCase();
		for (int i = 0; i <= s.length()/2; i++) { //checking half
			char start = s.charAt(i);
			char end = s.charAt(s.length()-1-i);
			
			if(start!=end) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		String name = "abcdcba";
		System.out.println(isPalindrome(name));
	}

}
