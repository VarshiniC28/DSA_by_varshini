package linear.search.algorithm;

public class SearchInStringArray {
	
	static boolean search(String [] arr, String target) {
		
		if(arr.length==0) {
			return false;
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]==target) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		String[] arr = {"HI", "Hello", "How", "are", "you"};
		System.out.println(search(arr, "HI"));
	}

}
