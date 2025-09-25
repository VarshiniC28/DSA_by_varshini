package recursion.part2;

import java.util.ArrayList;

public class LinearSearchRecursion {
	
	//1. Boolean
	static boolean find(int[] arr, int target, int idx) {
		if(idx == arr.length) return false;
		
		return arr[idx] == target || find(arr, target, idx + 1);
	}
	
	//-------------------------------------------------------------------------------
	
	//Return index
	static int findIdx(int[] arr, int target, int idx) {
		if(idx == arr.length) return -1;
		
		if(arr[idx] == target) return idx;
		else return findIdx(arr, target, idx + 1);
	}
	
	//-------------------------------------------------------------------------------
	
	
	//Return index parsing array from backward
	static int findLastIdx(int[] arr, int target, int idx) {
		if(idx == -1) return -1;
		
		if(arr[idx] == target) return idx;
		else return findLastIdx(arr, target, idx - 1);
	}
	
	//-------------------------------------------------------------------------------
	
	
	//Returning all indexes using ArrayList
	static ArrayList<Integer> list  = new ArrayList<Integer>();
	static int findAllIdx(int[] arr, int target, int idx) {
		if(idx == arr.length) return -1;
		
		if(arr[idx] == target) list.add(idx);
		
		return findAllIdx(arr, target, idx + 1);
	}

	
	//-------------------------------------------------------------------------------

	//returning all indexes with Array list passed as argument and return type itself is ArrayList
	static ArrayList<Integer> findAllIndexes(int[] arr, int target, int idx, ArrayList<Integer> list){
		if(idx == arr.length) return list;
		
		if(arr[idx] == target) list.add(idx);
		
		return findAllIndexes(arr, target, idx + 1, list);
	}
	
	
	//-------------------------------------------------------------------------------
	
	//Return list but dont take it as argument( create list inside the body)
	static ArrayList<Integer> find2(int [] arr, int target, int idx){
		
		ArrayList<Integer> list = new ArrayList<>();
		
		if(idx == arr.length) return list;
		if(arr[idx] == target) list.add(idx); //This will contain answer for that function call only
		
		ArrayList<Integer> ansFromBelowCalls = find2(arr, target, idx + 1); //so we store each function calls answer in this ArrayList and later add that all to list
		list.addAll(ansFromBelowCalls);
		
		return list;
	}
	
	//-------------------------------------------------------------------------------
	
	
	
	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 4, 4, 5, 5};
		
		System.out.println(find(arr, 4, 0)); //Boolean
		
		System.out.println(findIdx(arr, 4, 0)); //idx
		
		System.out.println(findLastIdx(arr, 4, arr.length - 1)); //idx from last
		
		findAllIdx(arr, 4, 0);
		System.out.println(list);
		
		ArrayList<Integer> li = new ArrayList<>();
		System.out.println(findAllIndexes(arr, 5, 0, li));
		
		System.out.println(find2(arr, 4, 0));
		
	}
   
}
