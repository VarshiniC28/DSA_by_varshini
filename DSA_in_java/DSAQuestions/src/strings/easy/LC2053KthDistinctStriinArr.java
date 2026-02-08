package strings.easy;

import java.util.HashMap;
import java.util.Map;

//A distinct string is a string that is present only once in an array.

//Given an array of strings arr, and an integer k, return the kth distinct string present in arr. 
//If there are fewer than k distinct strings, return an empty string "".
//Note that the strings are considered in the order in which they appear in the array.
//
//Example 1:
//Input: arr = ["d","b","c","b","c","a"], k = 2
//Output: "a"
//Explanation:
//The only distinct strings in arr are "d" and "a".
//"d" appears 1st, so it is the 1st distinct string.
//"a" appears 2nd, so it is the 2nd distinct string.
//Since k == 2, "a" is returned. 

public class LC2053KthDistinctStriinArr {
	
	static String kthDistinct(String[] arr, int k) {
        
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(map.get(arr[i]) == 1){
                count++;
                if(count == k){
                    return arr[i];
                }
            }
        }

        return "";
    }

	public static void main(String[] args) {

		String[] arr = {"aaa","aa","a"};
		System.out.println(kthDistinct(arr, 2)); //"aa"
	}

}
