package strings.medium;

//567
//Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
//In other words, return true if one of s1's permutations is the substring of s2.
// 
//Example 1:
//Input: s1 = "ab", s2 = "eidbaooo"
//Output: true
//Explanation: s2 contains one permutation of s1 ("ba").

//Example 2:
//Input: s1 = "ab", s2 = "eidboaoo"
//Output: false

public class PermutionsInStrings {
	
	static boolean permu(String s1, String s2) {

		int[] freq1 = new int[26]; // frequency of s1 (what we NEED)
		int[] freq2 = new int[26]; // frequency of current window in s2 (what we HAVE)
		
		for(char ch : s1.toCharArray()) {
			freq1[ch - 'a']++; // count each character required from s1
		}
		
		int i = 0; // left pointer of sliding window (removes characters)
		for (int j = 0; j < s2.length(); j++) { // right pointer of sliding window (adds characters)
			
			freq2[s2.charAt(j) - 'a']++; // add current character (j) into window
			
			if(j - i + 1 > s1.length()) { // if window size exceeds s1 length
				freq2[s2.charAt(i) - 'a']--; // remove leftmost character from window
				i++; // move left pointer forward
			}
			
			if(matches(freq1, freq2)) { // check if current window is a permutation of s1
				return true; // permutation found
			}
		}
		
		return false; // scanned entire s2, no permutation found
	}

	static boolean matches(int[] freq1, int[] freq2) {
		
		for(int i=0; i<26; i++) { // compare all 26 lowercase letters
			if(freq1[i] != freq2[i]) { // any mismatch → not a permutation
				return false;
			}
		}
		
		return true; // all characters matched exactly
	}

	public static void main(String[] args) {

		System.out.println(permu("ab", "eidbamaoo")); // true → "ba" exists
		System.out.println(permu("ab", "eibdamaoo")); // false → no "ab" or "ba"
		
	}
}


