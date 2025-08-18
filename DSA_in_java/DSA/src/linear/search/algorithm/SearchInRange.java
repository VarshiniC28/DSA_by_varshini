package linear.search.algorithm;

public class SearchInRange {
	
	static boolean searchInrange(int[] arr, int target, int start, int end) {
		if(arr.length==0) {
			return false;
		}
		
		for (int i = start; i <=end; i++) {
			if(arr[i]==target) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5};
		System.out.println(searchInrange(arr,3,0,3));
	}

}
