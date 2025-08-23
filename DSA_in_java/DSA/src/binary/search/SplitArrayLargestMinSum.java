package binary.search;

/*Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.
 * Return the minimized largest sum of the split.
 * A subarray is a contiguous part of the array.*/
/*Input: nums = [7,2,5,10,8], k = 2
Output: 18
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.*/

public class SplitArrayLargestMinSum {
	
	//we are trying to find the min largest sums among all the large sums.
	static int split(int[] nums, int k) {
		int start=0, end=0; //upper and lower bound
		
		for(int i=0; i<nums.length; i++) {
			start = Math.max(start, nums[i]); //start - lower bound is the max number in the array
			end+=nums[i]; //end the upper bound is the total sum of the array
		}
		
		//now binary search to search the potential ans between lower and upper bound
		while(start<end) {
			int mid = start+(end-start)/2;
			
			//calculate no of pieces we can create
			int sum=0;
			int pieces=1; //can create at least 1 - i.e the arr itself
			for(int i: nums) {
				if(sum+i>mid) { //if we add our next num to sum, that will be greater than the mid, then we have to create new piece from there
					//so
					sum=i; //next sub arr will start from i, and sum will have i
					pieces++; //so since there will be new sub arr, piece count is increases
				}else { //else if sum doesnt exeed the mid then
					sum+=i; //keep adding the elements to sum
				}
			}
			
			//if pieces we created is > then given sub arrays k
			if(pieces>k) {
				start=mid+1; //than lower bound will be reduced to mid+1
			}else {
				end=mid;
			}
		}
		return end; //start and end will be same 
	}

	public static void main(String[] args) {
		
		int [] arr = {7,2,5,10,8};
		System.out.println(split(arr,2));
	}

}
