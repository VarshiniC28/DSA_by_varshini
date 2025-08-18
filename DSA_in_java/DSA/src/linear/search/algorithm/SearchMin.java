package linear.search.algorithm;

public class SearchMin {
	
	static int Searchmin(int[] arr) {
		int min= arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {

		int[] arr = {-3, 55,2, 90};
		System.out.println(Searchmin(arr));
	}

}
