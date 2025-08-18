package linear.search.algorithm;

import java.util.Arrays;

public class SearchIn2DArray {
	
	//search a element
	static int[] search(int[][] arr, int target) { //returns [row index, col index]
		if(arr.length==0){
			return new int[0];
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]==target) {
					return new int[] {i,j};
				}
			}
		}
		return new int[0];
	}
	
	//search max in 2D array
	static int search(int[][] arr) {
		if(arr.length==0){
			return -1;
		}
		
		int max = arr[0][0]; //Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]>max) {
					max = arr[i][j];
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {

		int [] [] arr = {{1,2,3},{32,5}};
		System.out.println(Arrays.toString(search(arr,5))); //prints [row index, col index]
		
		//max
		System.out.println(search(arr));
	}

}
