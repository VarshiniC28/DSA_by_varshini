package recursion.part7.Backtracking.MazeProb;

public class MazeAllDirectionsBacktracking {
	
	//Consider a maze(0 1 2) and what are all the possible ways to move from first box to last box
	//Can move in all directions - Up down left right

	//Here since we are using all up, left, right , down we will mark already visited cells as false, so if false it will return as we know
	//But to other recursion calls even if the path is right since the visited will be false already, the function will be returned and hence causing problems for future recursion calls
	//Hence we have to make it true again while the function is being returned and this is called Backtracking
	
	//BACKTRACKING : Problem solving algorithm technique used to build solution step by step and if at any step solution is invalid, it backtracks to previous steps to try different option
	//Simple words : Try a choice -> check if it works -> if not backtrack(undo) -> try next choice
	
	static void backtracking(String p,boolean[][] maze, int r , int c) {
		if(r == maze.length - 1 && c == maze[0].length - 1) {
			System.out.println(p);
			return;
		}
		
		if(!maze[r][c]) { //if false return
			return;
		}
		
		//i am considering this block in my oath as visited by marking it as false
		maze[r][c] = false;
		
		//down
		if(r < maze.length - 1) {
			backtracking(p + 'D', maze, r + 1, c);
		}
		
		//right
		if(c < maze[0].length - 1) {
			backtracking(p + 'R', maze, r, c + 1);
		}
		
		//up
		if(r > 0) {
			backtracking(p + 'U', maze, r - 1, c);
		}
		
		//left
		if(c > 0) {
			backtracking(p + 'L', maze, r, c - 1);
		}
		
		
		//this line is the where the function will be over
		//so before the function gets removed, also remove the changes that were made by the function
		maze[r][c] = true;
	}
	
	public static void main(String[] args) {

		boolean [][] maze = {
				{true, true, true},
				{true, true, true},
				{true, true, true}
		};
		
		backtracking("", maze, 0, 0);
	}

}
