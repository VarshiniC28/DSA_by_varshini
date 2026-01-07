package recursion.part7.backtrackingquestions;

//52
//The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.
//Given an integer n, return the number of distinct solutions to the n-queens puzzle.

public class NQueensIICountLC {
	
    static int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];

        boolean[] cols = new boolean[n];
        boolean[] diagL = new boolean[2*n - 1];
        boolean[] diagR = new boolean[2*n - 1];

        return counts(board, 0, cols, diagL, diagR);
    }

    static int counts(boolean[][] board, int row, boolean[] cols, boolean[] d1, boolean[] d2){
        if(row == board.length) return 1;

        int count = 0;

        for(int col=0; col<board.length; col++){

            int ld = row - col + board.length - 1;
            int rd =  row + col;

            if(cols[col] || d1[ld] || d2[rd]) continue;

            board[row][col] = true;
            cols[col] = d1[ld] = d2[rd] = true;

            count+= counts(board, row+1, cols, d1, d2);

            //backtrack
            board[row][col] = false;
            cols[col] = d1[ld] = d2[rd] = false;
        }

        return count;
    }

	public static void main(String[] args) {

		System.out.println(totalNQueens(5)); 
	}

}
