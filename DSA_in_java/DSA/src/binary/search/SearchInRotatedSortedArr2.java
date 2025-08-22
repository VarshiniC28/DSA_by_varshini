package binary.search;

/*There is an integer array nums sorted in ascending order (with distinct values).
 * Prior to being passed to your function, nums is possibly left rotated at an unknown index k (1 <= k < nums.length)
 * such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). 
 * For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2].
 * Given the array nums after the possible rotation and an integer target, 
 * return the index of target if it is in nums, or -1 if it is not in nums.
 * You must write an algorithm with O(log n) runtime complexity.
 */

public class SearchInRotatedSortedArr2 { //no duplicates

    // Single-pass Binary Search Implementation: instead of finding pivot separately
    static int searchInRotatedArray(int[] nums, int target) {

        int start = 0, end = nums.length - 1; // Initialize search boundaries

        // Standard binary search loop
        while (start <= end) {
            int mid = start + (end - start) / 2; // Prevent overflow; find mid index

            // If we found the target at mid, return its index
            if (target == nums[mid]) return mid;

            // Determine which half is sorted: Left half or Right half
            if (nums[start] <= nums[mid]) {
                // Left half [start..mid] is sorted

                // If target lies in the sorted left half, move search there
                if (nums[start] <= target && target < nums[mid]) end = mid - 1;
                else 
                    // Otherwise, target is in right half
                    start = mid + 1;
            } else {
                // Right half [mid..end] is sorted

                // If target lies in sorted right half, move search there
                if (nums[mid] < target && target <= nums[end]) start = mid + 1;
                else 
                    // Otherwise, target is in left half
                    end = mid - 1;
            }
        }

        // If we exit loop, target not found
        return -1;
    }

    public static void main(String[] args) {
//        int[] nums = {1,2,3,4,5};
    	int[] nums = {4,5,6,7,0,0,2};
        // Test: Search for target 2 in sorted array
        System.out.println(searchInRotatedArray(nums, 4)); // Expected output: index 1
    }
}
