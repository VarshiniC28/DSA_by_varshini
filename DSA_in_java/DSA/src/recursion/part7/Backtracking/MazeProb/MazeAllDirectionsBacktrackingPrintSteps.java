package recursion.part7.Backtracking.MazeProb;

import java.util.Arrays;

public class MazeAllDirectionsBacktrackingPrintSteps {
	
	//Consider a maze(0 1 2) and what are all the possible ways to move from first box to last box
	//Can move in all directions - Up down left right
	
	//Print the steps in another path array

	//Here since we are using all up, left, right , down we will mark already visited cells as false, so if false it will return as we know
	//But to other recursion calls even if the path is right since the visited will be false already, the function will be returned and hence causing problems for future recursion calls
	//Hence we have to make it true again while the function is being returned and this is called Backtracking
	
	//BACKTRACKING : Problem solving algorithm technique used to build solution step by step and if at any step solution is invalid, it backtracks to previous steps to try different option
	//Simple words : Try a choice -> check if it works -> if not backtrack(undo) -> try next choice
	
	static void backtrackingPrintStep(String p,boolean[][] maze, int[][] path, int step, int r , int c) {
		if(r == maze.length - 1 && c == maze[0].length - 1) { //this is the last step and when we print here also we should add that step to the path array
			path[r][c] = step;
			for(int[] arr : path) {
				System.out.println(Arrays.toString(arr));
			}
			System.out.println(p);
			System.out.println(); //add line for space after each path
			return;
		}
		
		if(!maze[r][c]) { //if false return
			return;
		}
		
		//i am considering this block in my path as visited by marking it as false
		maze[r][c] = false;
		
		path[r][c] = step; //after we made it false(visited) also make it as the step
		
		// and as we move in next direction to next cell, increase the step by 1
		
		//down
		if(r < maze.length - 1) {
			backtrackingPrintStep(p + 'D', maze, path, step + 1, r + 1, c);
		}
		
		//right
		if(c < maze[0].length - 1) {
			backtrackingPrintStep(p + 'R', maze, path, step + 1, r, c + 1);
		}
		
		//up
		if(r > 0) {
			backtrackingPrintStep(p + 'U', maze, path, step + 1, r - 1, c);
		}
		
		//left
		if(c > 0) {
			backtrackingPrintStep(p + 'L', maze, path, step + 1, r, c - 1);
		}
		
		
		//this line is the where the function will be over
		//so before the function gets removed, also remove the changes that were made by the function
		maze[r][c] = true;
		
		//Printing step also should be backtracked
		path[r][c] = 0; //as the function is removed
		
	}
	
	public static void main(String[] args) {

		boolean [][] maze = {
				{true, true, true},
				{true, true, true},
				{true, true, true}
		};
		
		int[][] path = new int[maze.length][maze[0].length];
		
		backtrackingPrintStep("", maze,path, 1, 0, 0); //step will start from 1
	}

}
