package recursion.part6.Backtracking.MazeProb;

public class MazeProblem {

	//considering a matrix and point A is 1st box and point B is last box (last row and last col)
	//Lets say 3 x 3 matrix and r and c goes from 3 to 1 - then A - first box is (3,3) and B last box is (1,1)
	// Possible ways to go from 3,3 to 1,1
	
	
//	Return count of all possible ways to reach from first box A to last B in a maze
	static int maze(int r , int c) {
		if(r == 1 || c == 1) {
			return 1;
		}
		
		//recursion - down right + (recursion) , or - right down + (recursion)
		int left = maze(r - 1, c); //moving down
		int right = maze(r, c - 1); //moving right
		
		return left + right;
	}
	
	//Now print  all the possible ways instead
	static void mazePath(String p, int r, int c) {
		if(r == 1 && c == 1) {
			System.out.println(p);
			return;
		}
		
		if(r > 1) {
			mazePath(p + 'D', r - 1, c);
		}
		
		if(c > 1) {
			mazePath(p + 'R', r, c-1);
		}
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(maze(3, 3));
		
		mazePath("", 3,3);
	}
}
