package programmingLogic;

public class MaxNumInArray {

	static int max(int [] arr) {
		int max = arr[0];
		for(int i =0; i<arr.length; i++) {
			if(arr[i]> max) {
				max = arr[i];
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {

		int[] arr = { 1,12, 45, 10, 0};
		System.out.println(max(arr));
	}

}
