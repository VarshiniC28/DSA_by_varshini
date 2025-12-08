 package array.dsa;

import java.util.*;

/*
 * There are n kids with candies. 
 * You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, 
 * and an integer extraCandies, denoting the number of extra candies that you have.
 * Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, 
 * they will have the greatest number of candies among all the kids, or false otherwise.
 * Note that multiple kids can have the greatest number of candies.
 */

public class KidswithGreatestCandies {
	
	static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){ 
		
//		int max = Arrays.stream(candies).max().getAsInt(); // this also works but more time complexity.
		
		int maxCandies = 0;
		for(int candy: candies) {
			maxCandies = Math.max(candy, maxCandies);
		}
		
		List<Boolean> result = new ArrayList<>();
		for(int candy : candies) {
			result.add(candy+extraCandies>=maxCandies);
		}
		
		return result;
	}
	
	public static void main(String[] args) {

		int[] candies = {2,3,5,1,3};
		System.out.println(kidsWithCandies(candies, 3));
	}

}
