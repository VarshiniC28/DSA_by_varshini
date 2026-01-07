package recursion.part7.backtrackingquestions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//51.
//The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.
//Given an integer n, return all distinct solutions to the n-queens puzzle. You may return the answer in any order.
//Each solution contains a distinct board configuration of the n-queens' placement, 
//where 'Q' and '.' both indicate a queen and an empty space, respectively.

public class NQueensOptimizedLC {

	static List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();

        char[][] board = new char[n][n];
        for(char[] row : board){
            Arrays.fill(row, '.');
        }

        boolean[] cols = new boolean[n];
        boolean[] diagL = new boolean[2*n - 1];
        boolean[] diagR = new boolean[2*n - 1];

        solve(board, 0, cols, diagL, diagR, res);
        return res;
    }

    static void solve(char[][] board, int row, boolean[] cols, boolean[] diagL, boolean[] diagR, List<List<String>> res){

        if(row == board.length){
            List<String> list = new ArrayList<>();
            for(char [] r : board) list.add(new String(r));
            res.add(list);
            return;
        }

        for(int col=0; col<board.length; col++){
            int d1 = row - col + board.length - 1;
            int d2 = row + col;

            if(cols[col] || diagL[d1] || diagR[d2]) continue;

            board[row][col] = 'Q';
            cols[col] = diagL[d1] = diagR[d2] = true;

            solve(board, row+1, cols, diagL, diagR, res);

            //backtrack now;
            board[row][col] = '.';
            cols[col] = diagL[d1] = diagR[d2] = false;
        }
    }
	
	public static void main(String[] args) {

		List<List<String>> list = solveNQueens(5);
		System.out.println(list);
		
	}

}
