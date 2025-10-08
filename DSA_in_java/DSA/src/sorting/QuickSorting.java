package sorting;

import java.util.Arrays;

public class QuickSorting {
	
	static void sort(int[] arr , int low, int high) {
		
		if(low >= high) return;
		
		int s = low;
		int e = high;
		
		int m = s + (e - s)/ 2;
		int pivot = arr[m];
		
		while(s <= e) {
			
			//also a reason why if its already sorted it will not swap
			while(arr[s] < pivot) {
				s++;
			}
			
			while(arr[e] > pivot) {
				e--;
			}
			
			if(s <= e) {
				int temp = arr[s];
				arr[s] = arr[e];
				arr[e] = temp;
				s++;
				e--;
			}
		}
		
		//now my pivot is current index, now sort the 2 halves they are (low, end) and (start, high)
		
		sort(arr, low, e);
		sort(arr, s, high);
	}

	public static void main(String[] args) {
		
		//Quick sort:
		int[] arr = {5,4,3,2,1};
//		sort(arr, 0, arr.length - 1);
//		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr); //This inbuilt sort method uses Quick sort and internally insertion sort , heap sort and much more complex implementation
		System.out.println(Arrays.toString(arr));
	}

}
