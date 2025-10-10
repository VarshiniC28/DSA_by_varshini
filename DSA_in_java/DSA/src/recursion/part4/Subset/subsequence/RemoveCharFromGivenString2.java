package recursion.part4.Subset.subsequence;

public class RemoveCharFromGivenString2 {

	//Remove a's from the given string: //Return string Way 2
	static String skip(String up) { //String up first has the original String given, 
		//up will be empty at last
		if(up.isEmpty()) {
			return "";
		}
		
		char ch = up.charAt(0);
		
		if(ch == 'a') {
			return skip(up.substring(1)); //first char at every recursion is removed from the string
		}else {
			return ch + skip(up.substring(1)); //if that char is not 'a' then we add that char to recursion and remove and pass remaining string to the next recursion
		}
		
		
	}
	
	public static void main(String[] args) {

		System.out.println(skip("baacchaad "));
	}

}
