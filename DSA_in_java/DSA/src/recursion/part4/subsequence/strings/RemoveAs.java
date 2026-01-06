package recursion.part4.subsequence.strings;

public class RemoveAs {
	
	static void skip(String p , String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		char ch = up.charAt(0);
		if(ch=='a') {
			skip(p, up.substring(1));
		}else {
			skip(p+ch, up.substring(1));
		}
	}

	//with only 1 argument and must return that string
	
	static String skip2(String up) {
		if(up.isEmpty()) {
			return "";
		}
		
		char ch = up.charAt(0);
		
		if(ch == 'a') {
			return skip2(up.substring(1));
		}else {
			return ch+skip2(up.substring(1));
		}
	}
	
	public static void main(String[] args) {

		skip("","abaadcd");
		System.out.println(skip2("abaadcd"));
	}

}
