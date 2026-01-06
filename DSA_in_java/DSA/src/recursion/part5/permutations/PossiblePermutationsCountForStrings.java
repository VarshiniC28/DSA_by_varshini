 package recursion.part5.permutations;

public class PossiblePermutationsCountForStrings {
	
	//No of permutations possible for a string - count formula is = no of chars ! (n !)
	//but to do through code we can do as below
	//no of calls = size of p + 1;
	
	static int permCount(String p, String up) {
		if(up.isEmpty()) return 1;
		
		char ch = up.charAt(0);
		
		int count = 0;
		
		for(int i=0; i <= p.length(); i++) {
			String f = p.substring(0,i);
			String s = p.substring(i,p.length());
			count = count + permCount(f + ch + s, up.substring(1));
		}
		
		return count;
	}

	static int permCount(String p, String up, int count) {
		if(up.isEmpty()) {
			return count + 1;
		}
		
		char ch = up.charAt(0);
		
		for (int i = 0; i <= p.length(); i++) {
			String f = p.substring(0, i);
			String s = p.substring(i, p.length());
			count = permCount(f + ch + s, up.substring(1), count);
		}
		
		return count;
	}
	
	public static void main(String[] args) {
	
		System.out.println(permCount("", "abc", 0)); //ans should be 3! = 6
	}
}
