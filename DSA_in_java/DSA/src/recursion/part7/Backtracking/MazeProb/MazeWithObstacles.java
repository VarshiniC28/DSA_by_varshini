package recursion.part7.Backtracking.MazeProb;

public class MazeWithObstacles {
	
	//Consider a matrix (say 3 x 3 and r and c order goes like 0 1 2) has obstacle river in middle box and then what are the possible ways to move from first box to last box
	//will take boolean matrix , false - means there is obstacle
	//can move only right and down
	static void maze(String p, boolean[][] maze, int r , int c) {
		
		if(r == maze.length - 1 && c == maze[0].length - 1) { //since here we start from 0 -1 2, last row col is maze.length -  1 and rows length
			System.out.println(p);
			return;
		}
		
		if(!maze[r][c]) { //when it is false it means there is obstacle, so just return that call
			 return;
		}
		
		if( r < maze.length - 1) {
			maze(p + 'D', maze, r + 1, c); //Here since it is 0 1 2, r + 1
		}
		
		if(c < maze.length - 1) {
			maze(p + 'R', maze, r, c+1);
		}
	}

	public static void main(String[] args) {

		boolean [][] maze = {
				{true, true, true},
				{true, false, true},
				{true, true, true}
		};
		maze("",maze, 0, 0);
	}

}
