package programmingLogic;

public class MaxNumBetweenRangeInArray2 {

	static int max(int [] arr, int start, int end) {
		int max = arr[0];
		for(int i =start; i<=end; i++) {
			if(arr[i]> max) {
				max = arr[i];
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {

		int[] arr = { 1,12, 45, 10, 0};
		System.out.println(max(arr,0,3));
	}

}
