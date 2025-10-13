package recursion.part4.subsequence.strings;

public class SubsequenceForStrings {
	
	static void subseq(String p, String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		char ch = up.charAt(0);
		
		subseq(p + ch, up.substring(1)); //-> Left call : Take the string
		subseq(p, up.substring(1)); //-> right call : ignore the string
	}

	public static void main(String[] args) {

		subseq("", "abc"); //abc, ab, ac, a, bc,b, c , " " - 8 subsequences possible including empty string
	}

}
