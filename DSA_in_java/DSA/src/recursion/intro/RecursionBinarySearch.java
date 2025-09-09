package recursion.intro;

public class RecursionBinarySearch {
	
	static int search(int[] arr, int target, int s, int e) {
		while(s<=e) {
			int mid = s + (e-s)/2;
			
			if(target==arr[mid]) {
				return mid;
			}else if(target<arr[mid]) {
				return search(arr, target, s, mid-1);
			}else if(target>arr[mid]) {
				return search(arr, target, mid+1, e);
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {

		int [] arr = { 1,2,3,4,5,6,7};
		System.out.println(search(arr, 7, 0, arr.length-1));
	}

}
