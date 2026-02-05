package arrays.dsa;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckIfArrayIsSorter {

    static boolean isSorted(ArrayList<Integer> nums) {

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                return false;   
            }
        }
        return true;
    }
	
	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 4));
		System.out.println(isSorted(arr));
	}

}
