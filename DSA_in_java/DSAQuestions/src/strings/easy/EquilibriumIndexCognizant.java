package strings.easy;

//Given a lower case string s, where a = 1, b = 2, ..., z = 26, 
//return the smallest position 1-index based i+1
//such that the sum of character values to the left of i equals the sum of character values to the right of i; 
//if no such index exists, return -1.

public class EquilibriumIndexCognizant {
	
	static int EquiIndex(String s) {
		int total=0;
		for(char ch: s.toCharArray()) total += ch - 'a' + 1;
		
		int left = 0;
		for(int i=0; i<s.length(); i++) {
			int curr = s.charAt(i) -'a' + 1;
			if(left == total - left - curr) {
				return i+1;
			}
			left+= curr;
		}
		return -1;
	}

	public static void main(String[] args) {

		System.out.println(EquiIndex("abbae"));
	}

}
