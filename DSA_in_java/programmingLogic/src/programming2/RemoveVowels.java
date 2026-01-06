package programming2;

public class RemoveVowels {
	
	static String removeVowels(String s) {
		
		StringBuilder str = new StringBuilder();
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if("aeiouAEIOU".indexOf(ch)!=-1) {
				continue;
			}else {
				str.append(ch);
			}
		}
		
		return str.toString();
	}

	public static void main(String[] args) {

		System.out.println(removeVowels("india"));
	}

}
