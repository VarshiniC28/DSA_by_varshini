package strings.easy;

public class FirstUniqueCharInString {
	
	//find the index of first non repeating char in a string if didn't find return -1
	
	static int firstUniqChar(String s) {
		
		int[] freq = new int[26];
		
		for(char ch : s.toCharArray()) {
			freq[ch - 'a']++;
		}
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(freq[ch - 'a'] == 1) {
				return i;
			}
		}
		
		return -1;
	}
	
	//this is not preferred in interview though follow the 
	static int secMostUniqChar(String s) {

	    int[] freq = new int[26];

	    for (char ch : s.toCharArray()) {
	        freq[ch - 'a']++;
	    }

	    int first = -1;

	    // find first unique
	    for (int i = 0; i < s.length(); i++) {
	        if (freq[s.charAt(i) - 'a'] == 1) {
	            first = i;
	            break;
	        }
	    }

	    // find second unique AFTER first
	    if (first != -1 && first < s.length() - 1) {
	        for (int i = first + 1; i < s.length(); i++) {
	            if (freq[s.charAt(i) - 'a'] == 1) {
	                return i;
	            }
	        }
	    }

	    return -1;
	}

	//using count
	static int secMostUniqChar2(String s) {

	    int[] freq = new int[26];

	    for (char ch : s.toCharArray()) {
	        freq[ch - 'a']++;
	    }

	    int count = 0;
	    for (int i = 0; i < s.length(); i++) {
	        if (freq[s.charAt(i) - 'a'] == 1) {
	        	count++;
	        	if(count == 2) {
	        		return i;
	        	}
	        }
	    }

	    return -1;
	}


	public static void main(String[] args) {

		System.out.println(firstUniqChar("eetcode"));
		System.out.println(secMostUniqChar("leetcode"));
		System.out.println(secMostUniqChar2("leetcode"));
	}

}
