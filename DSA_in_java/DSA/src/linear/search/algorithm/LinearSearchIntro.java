package linear.search.algorithm;

public class LinearSearchIntro {
	
	//This method searches the target in the array, if found returns index , if not found -1
	static int linearSearch(int[] arr , int target) { //can also return true or false , by changing the return type to boolean, and return true/false accordingly
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr.length==0) {
				return -1;
			}
			
			int element = arr[i];
			if(element==target) {
				return i; // if we want element we can also return element
//				return element;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int [] nums = { 1,32,54, 77, 90};
		int target = 90;
		//System.out.println(linearSearch(nums,target));
		
		int result = linearSearch(nums, target);
		
		if(result == -1) {
			System.out.println("Element not found");
		}else {
			System.out.println("Element " +nums[result] +" found at: "+result);
		}
		
	}
}
