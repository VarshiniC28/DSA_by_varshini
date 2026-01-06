package recursion.part7.Backtracking.MazeProb;
import java.util.ArrayList;

/*
 * A rat starts at position (0,0) in an n x n matrix maze[][] and must reach (n-1,n-1).
 * Each cell contains either 1 (free cell) or 0 (blocked cell).
 * The rat can move only to adjacent cells in four directions: U (up), D (down),
 * L (left), and R (right).
 * The rat cannot visit the same cell more than once in a single path and
 * cannot move outside the matrix or into blocked cells.
 * Find all possible paths from start to destination.
 * If no path exists, return an empty list.
 * Return the paths in lexicographically smallest order.
 */


public class RatInMaze {
	
    public ArrayList<String> ratInMaze(int[][] maze) {
        
        ArrayList<String> list = new ArrayList<String>();
        
        //What if first entry cell is zero or destination cell is 0
        if(maze[0][0] == 0 || maze[maze.length-1][maze.length - 1] == 0) return list;
        
        return helper("", maze, 0, 0);
        
    }
    
    public static ArrayList<String> helper(String p, int[][] maze, int r, int c){
        
        ArrayList<String> list = new ArrayList<>();
        
        if(maze[r][c] == 0) return list;
        
        if(r == maze.length - 1 && c == maze.length - 1){
            list.add(p);
            return list;
        }
        
        maze[r][c] = 0;
        
        //lexicographical order - D L R U 
        if(r < maze.length - 1) list.addAll(helper(p+'D', maze, r+1, c));
        if(c > 0) list.addAll(helper(p+'L', maze, r, c-1));
        if(c < maze.length - 1) list.addAll(helper(p+'R', maze, r, c+1));
        if(r > 0) list.addAll(helper(p+'U', maze, r-1, c ));
        
        maze[r][c] = 1;
        
        return list;
    }

    //===============================================================================
    
    //passing list in argument
    public ArrayList<String> ratInMaze2(int[][] maze) {

        ArrayList<String> list = new ArrayList<>();
        int n = maze.length;

        // start or end blocked
        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0)
            return list;

        helper2("", maze, 0, 0, list);
        return list;
    }

    public static void helper2(String p, int[][] maze, int r, int c, ArrayList<String> list) {

        // invalid / blocked / visited
        if (maze[r][c] == 0)
            return;

        // destination reached
        if (r == maze.length - 1 && c == maze.length - 1) {
            list.add(p);
            return;
        }

        // mark visited
        maze[r][c] = 0;

        // lexicographical order: D L R U
        if (r < maze.length - 1)
            helper2(p + 'D', maze, r + 1, c, list);

        if (c > 0)
            helper2(p + 'L', maze, r, c - 1, list);

        if (c < maze.length - 1)
            helper2(p + 'R', maze, r, c + 1, list);

        if (r > 0)
            helper2(p + 'U', maze, r - 1, c, list);

        // backtrack
        maze[r][c] = 1;
    }
    
	public static void main(String[] args) {

		int[][] arr = {{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}};
		
		
	}

}
