package iteration.part4.subsets.arrays;

import java.util.ArrayList;
import java.util.List;

public class SubsetsOfArrayIteration {
	
	//
	static List<List<Integer>> subset(int[] arr){
		
		List<List<Integer>> outerlist = new ArrayList<>();
		
		// start with an empty subset
		outerlist.add(new ArrayList<>());
		
		for (int num : arr) {
			int n = outerlist.size();
			
			// for every existing subset, add a new subset that also includes 'num'
			for (int i = 0; i < n; i++) {
				List<Integer> internal = new ArrayList<>(outerlist.get(i)); // copy
				internal.add(num);  // add current number
				outerlist.add(internal); // add this new subset to outerlist
			}
		}
		
		return outerlist;
		
	}

	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		List<List<Integer>> ans =subset(arr);
		for(List<Integer> list : ans) {
			System.out.println(list);
		}
	}
}
