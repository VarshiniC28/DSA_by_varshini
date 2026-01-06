 package array.dsa;

import java.util.Arrays;

public class Are2StringsAnagram {
	
	//Anagram is when both strings has same number of characters, same characters and count of each char in both strings should be same
	//listen: l=1, i=1, s=1, t=1, e=1, n=1
	//silent: s=1, i=1, l=1, e=1, n=1, t=1
	
	//❗These loops are NOT nested . They run one after another:
	// O(n+n+26)=O(2n+26)=O(n) || NOT O(n³), not even O(n²). Just O(n)
	static boolean isAnagram(String a, String b) {
		
		if(a.length() != b.length()) return false;
		
		int[] freq = new int[26];
		
		for(char ch : a.toCharArray()) {
			freq[ch - 'a']++; //'a' - 'a' = 97-97 = 0, 'b'-'a' = 98-97 = 1..so on
		}
		
		for(char ch: b.toCharArray()) {
			freq[ch - 'a']--;
		}
		
		for(int fre : freq) {
			if(fre!= 0) {
				return false;
			}
		}
		
		return true;
	}
	
	//or simple but slower method - O(nlogn)
	static boolean isAna(String a, String b) {
		if(a.length() != b.length()) return false;
		
		char[] a_1 = a.toCharArray();
		char[] b_1 = b.toCharArray();
		
		Arrays.sort(a_1);
		Arrays.sort(b_1);
		
		return Arrays.equals(a_1, b_1);
	}

	public static void main(String[] args) {
		
		System.out.println(isAnagram("listen","silent"));
		System.out.println(isAna("listen","ailent"));
	}
}
