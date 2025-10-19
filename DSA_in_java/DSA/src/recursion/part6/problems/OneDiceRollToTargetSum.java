package recursion.part6.problems;

import java.util.ArrayList;
import java.util.List;

public class OneDiceRollToTargetSum {
	
	//what all combinations in one dice can give us our target sum - Only one dice considered here
	static void dice(String p, int target){
		if(target == 0) {
			System.out.println(p);
			return;
		}
		
		for (int i = 1; i <= 6 && i <= target ; i++) {
			dice(p+i, target - i);
		}
	}
	
	//Returning the same in list format and taking number of faces input 
	static List<String> dice1(String p, int target , int face){
		if(target == 0) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		
		ArrayList<String> li = new ArrayList<>();
		
		for (int i = 1; i <= face && i <= target ; i++) {
			li.addAll(dice1(p+i, target - i, face));
		}
		
		return li;
	}

	public static void main(String[] args) {

		dice("", 4);
		
		System.out.println(dice1("", 4, 8));
	}

}
