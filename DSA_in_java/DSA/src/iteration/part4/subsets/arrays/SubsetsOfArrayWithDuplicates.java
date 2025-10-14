package iteration.part4.subsets.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsOfArrayWithDuplicates {

	static List<List<Integer>> subsetsWithduplicates(int[] arr){
		
		Arrays.sort(arr); //must be sorted since this works only when duplicate are adjacent and only then we can know if the previous number was same as current
		
		List<List<Integer>> outer = new ArrayList<>();
		
		outer.add(new ArrayList<>());
		
		int start = 0;
		int end = 0;
		
		for (int i = 0; i < arr.length; i++) {
			start = 0; 
			
			//if current and previous element is same the end = start + 1;
			if(i > 0 && arr[i] == arr[i - 1]) {
				start =  end + 1;
			}
			
			end = outer.size() - 1;
			int n = outer.size();
			
			for (int j = start; j < n; j++) {
				List<Integer> internal = new ArrayList<>(outer.get(j));
				internal.add(arr[i]);
				outer.add(internal);
			}
			
		}

		return outer;
	}
	
	public static void main(String[] args) {

		int[] arr = {2,1,2};
		
		List<List<Integer>> ans = subsetsWithduplicates(arr);
		
		for(List<Integer> list : ans) {
			System.out.println(list);
		}

	}

}
