package recursion.part2;

public class Array {
	
	static boolean sorted(int[] arr, int index) {
		if(index == arr.length - 1) return true;
		return arr[index] <arr[index + 1] && sorted(arr, index + 1);
	}

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 4, 15, 8};
		System.out.println(sorted(arr, 0));
	}

}
