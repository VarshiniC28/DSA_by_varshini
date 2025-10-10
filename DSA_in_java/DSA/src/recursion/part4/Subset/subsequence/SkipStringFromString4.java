package recursion.part4.Subset.subsequence;

public class SkipStringFromString4 {
	
	//Skip "app" string from the given string only when its not equal to "apple"
	static String skipApp(String up) {
		if(up.isEmpty()) {
			return "";
		}
		
		if(up.startsWith("app") && !up.startsWith("apple")) {
			return skipApp(up.substring(3));
		}else
			return up.charAt(0) + skipApp(up.substring(1));
	}

	public static void main(String[] args) {

		System.out.println(skipApp("bccappledch")); //will not skip "app" since its "apple"
		System.out.println(skipApp("bccappdhgf")); //will skip "app" since there is no "apple"
	}

}
