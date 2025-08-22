package binary.search;

public class MinInRotatedSortedArray {

	static int findMin(int [] arr) {
		int start=0, end=arr.length-1;
		
		while(start<end) {
			int mid= start+(end-start)/2;
			
			if(arr[mid]<arr[end]) end=mid;
			else if(arr[mid]>arr[end]) start=mid+1;
		}
		return arr[start];
		
		
		//in the format of pivot, but above is more sufficient
		
		//---/ 
		
	}
	
	public static void main(String[] args) {

//		int [] arr = {1};
//		int [] arr = {1,2,3,4,5};
		int [] arr = {4,5,6,7,0};
		System.out.println(findMin(arr));
	}

}
