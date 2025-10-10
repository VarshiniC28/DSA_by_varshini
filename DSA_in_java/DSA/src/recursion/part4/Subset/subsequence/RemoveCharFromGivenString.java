package recursion.part4.Subset.subsequence;

public class RemoveCharFromGivenString {

	//Remove a's from the given string: //no return , print string
	static void skip(String p, String up) { //String up first has the original String given, p will have answer string printed 
		//up will be empty at last
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		char ch = up.charAt(0);
		
		if(ch == 'a') {
			skip(p, up.substring(1)); //first char at every recursion is removed from the string
		}else {
			skip(p + ch, up.substring(1)); //if that char is not 'a' then we add that char to ans p and remove and pass remaining string to the next recursion
		}
		
		
	}
	
	public static void main(String[] args) {

		skip("", "baaccdah"); // at first the ans variable p will be empty
	}

}
