package linear.search.algorithm;

public class SearchMax {
	
	static int Searchmax(int[] arr) {
		int max= arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {

		int[] arr = {1,200,3,2,34,5};
		System.out.println(Searchmax(arr));
	}

}
