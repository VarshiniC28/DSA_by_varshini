package binary.search;

public class MaxInRotatedSortedArray2 {

	static int findMax(int [] arr) {
		int start=0, end=arr.length-1;
		
		while(start<=end) {
			int mid= start+(end-start)/2;
			
	        if (mid < end && arr[mid] > arr[mid + 1]) return arr[mid];
	        if (mid > start && arr[mid] < arr[mid - 1]) return arr[mid - 1];
	        
	        else if(arr[mid]<=arr[start]) {
				end=mid-1;
			}else if(arr[mid]>=arr[start]) {
				start=mid+1;
			}
		}
		return arr[start];
	}
	
	public static void main(String[] args) {

//		int [] arr = {1};
//		int [] arr = {1,2,3,4,5};
		int [] arr = {4,5,6,7,0};
		System.out.println(findMax(arr));
	}

}
