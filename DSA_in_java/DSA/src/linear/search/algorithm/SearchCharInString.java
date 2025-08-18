package linear.search.algorithm;

import java.util.Arrays;

public class SearchCharInString {
	
	//using for loop
	static boolean search(String search, char target) {
		
		if(search.length()==0) {
			return false;
		}
		
		for (int i = 0; i < search.length(); i++) {
			if(search.charAt(i)==target) {
				return true;
			}
		}
		return false;
	}
	
	//using for each loop
	static boolean search2(String str, char target) {
		
		if(str.length()==0) {
			return false;
		}
		
		for(char ch : str.toCharArray()) {
			if(ch==target) {
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {

		String name  = "Varshini C";
		char target = 'i';
		System.out.println(search(name, target));
		
		System.out.println(Arrays.toString(name.toCharArray()));
		System.out.println(search2(name, target));
	}

}
