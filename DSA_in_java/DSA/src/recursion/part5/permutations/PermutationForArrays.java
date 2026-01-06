package recursion.part5.permutations;

import java.util.ArrayList;
import java.util.List;

//46. Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
//Example 1:
//
//Input: nums = [1,2,3]
//Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

//Example 2:
//
//Input: nums = [0,1]
//Output: [[0,1],[1,0]]

public class PermutationForArrays {
	
	static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(used, nums, res, new ArrayList<>());
        return res;
    }

    static void backtrack(boolean[] used, int[] arr, List<List<Integer>> list, ArrayList<Integer> curr){

        if(curr.size() == arr.length){
            list.add(new ArrayList<>(curr));
            return;
        }

        for(int i=0; i<arr.length; i++){
            if(used[i] == true) continue;

            used[i] = true;
            curr.add(arr[i]);

            backtrack(used, arr, list, curr);

            curr.remove(curr.size()-1);
            used[i] = false;
        }
    }

	public static void main(String[] args) {

		int[] arr = {1,2,3};
		System.out.println(permute(arr));
	}

}
