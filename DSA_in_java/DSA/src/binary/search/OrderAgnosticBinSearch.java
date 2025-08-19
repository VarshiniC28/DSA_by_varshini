package binary.search;
public class OrderAgnosticBinSearch { 
	
	static int BinarySearch(int[] arr, int target) {
		int start = 0;
		int end  =arr.length-1;
		if(arr[start]<arr[end]) {
			while(start<=end) {
				//find the middle element
//				int mid = (start+end)/2; -> might start+end exceed the int value  
				int mid = start+(end-start)/2;
				
				if(target<arr[mid]) {
					end = mid-1;
				}else if(target>arr[mid]) {
					start = mid+1;
				}else {
					return mid; //last mid will be our target
				}
			}
			
		}else if(arr[start]>arr[end]) {
			while(start<=end) {
				//find the middle element
//				int mid = (start+end)/2; -> might start+end exceed the int value  
				int mid = start+(end-start)/2;
				
				if(target>arr[mid]) {
					end = mid-1;
				}else if(target<arr[mid]) {
					start = mid+1;
				}else {
					return mid; //last mid will be our target
				}
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {

		//Order Agnostic Binary Search: //When we dont know whether the array is sorted desc or asc order, but we know for array is sorted
		
		int[] arr = {1,2,3,4,5}; //ascending
//		int[] arr = {5,4,3,2,1};
		System.out.println(BinarySearch(arr,4));
	}

}
