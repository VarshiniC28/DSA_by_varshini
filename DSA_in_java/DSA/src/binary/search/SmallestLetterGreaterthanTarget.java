package binary.search;

//Given char array letters, sorted in asc order and char target.
//return the smallest char in array that is larger than target.
//if the smallest largest char than target is not found wrap around i,e is return char at 0

public class SmallestLetterGreaterthanTarget {
	
	static char nextGreatestLetter(char[] letters, char target) {
		
		int start = 0;
		int end = letters.length-1;
		
		while(start<=end) {
			int mid = start+(end-start)/2;
			
			if(target<letters[mid]) end=mid -1;
			// handles both target == letters[mid] and target > letters[mid], if target==letters[mid] then program dont move at all
			else start = mid+1;
//			else letters[mid]; //no need since we want > not >=
		}
		return letters[start%letters.length]; //same as if(start==letters.length) return letter[0]; and also when finding smallest greatest char than target we return start and here start%N = start
		//-> to wrap around as per the condition, -> as start at last will be letters.length+1(start=end+1)
	}
	
	public static void main(String[] args) {
		
		System.out.println("Program started");
		char[] arr = {'c','i','j'};
		System.out.println(nextGreatestLetter(arr,'j'));
	}
}
