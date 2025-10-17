package recursion.part5.permutations;

import java.util.ArrayList;

public class PossiblePermutationsOfAString {

	//FInd all possible permutations of String str = "abc"
	static void permutations(String p, String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		char ch = up.charAt(0);
		
		for (int i = 0; i <= p.length(); i++) { //since number of recursive calls is = size of p + 1
			String f = p.substring(0,i);
			String s = p.substring(i, p.length());
			permutations(f + ch + s, up.substring(1));
		}
	}
	
	//In ArrayList
	static ArrayList<String> permutation(String p, String up){
		if(up.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		
		char ch = up.charAt(0);
		
		ArrayList<String> li = new ArrayList<>();
		
		for (int i = 0; i <= p.length(); i++) {
			String f = p.substring(0,i);
			String s = p.substring(i,p.length());
			li.addAll(permutation(f + ch + s, up.substring(1)));
		}
		
		return li;
	}
	
	public static void main(String[] args) {

		permutations("", "abc");
		//------------------------------------------------------
		System.out.println();
		
		//-------------------------------------------------------
		
		//arraylist
		ArrayList<String> ans = permutation("", "abc");
		System.out.println(ans);
	}

}
