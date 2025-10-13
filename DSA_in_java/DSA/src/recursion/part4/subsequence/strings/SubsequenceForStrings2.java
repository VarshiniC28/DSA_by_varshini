package recursion.part4.subsequence.strings;

import java.util.ArrayList;

public class SubsequenceForStrings2 {
	
	//Instead of printing, adding the possible subsequences to array list
	static ArrayList<String> subseq(String p, String up, ArrayList<String> list) {
		if(up.isEmpty()) {
			list.add(p);
			return list; //stop recursion here
		}
		
		char ch = up.charAt(0);
		
		subseq(p + ch, up.substring(1), list); //-> Left call : Take the string
		subseq(p, up.substring(1), list); //-> right call : ignore the string
		
		return list;
	}
	
	//Now instead of passing array list as argument , using array list inside the body
	static ArrayList<String> subseq2(String p, String up){
		if(up.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		
		char ch = up.charAt(0);
		
		ArrayList<String> left = subseq2(p + ch, up.substring(1));
		ArrayList<String> right = subseq2(p, up.substring(1));
		
		left.addAll(right);
		
		return left;
	}

	public static void main(String[] args) {

		ArrayList<String> list = subseq("", "abc", new ArrayList<>()); //abc, ab, ac, a, bc,b, c , " " - 8 subsequences possible including empty string
		System.out.println(list);
		
		
		System.out.println(subseq2("", "abc"));
	}

}
