package recursion.part7.backtrackingquestions;

public class NQueens {

	
//	Given n, nxn board, place n queens on it. So that each queen cant attack other. i.e Q should not be in the same row , column and diagonal of other Q
//	How many possible ways can we do this and total number of ways?
	
	//This is recursion and backtracking
	
	static int nqueens(boolean[][] board, int row) {
		if(row == board.length) {
			display(board);
			System.out.println();
			return 1;
		}
		
		int count = 0;
		
		//in each row check every column if its safe, if its safe i.e true then place Q i.e make it true
		for(int col = 0; col < board.length; col++) {
			//place the queen if its safe
			if(isSafe(board, row, col)) { // if safe - true , u can place queen
				board[row][col] = true;
				count += nqueens(board, row + 1);
				//then backtrack to false after function is returned or removed
				board[row][col] = false;
			}
		}
		
		return count;
	}
	
	static boolean isSafe(boolean[][] board, int row, int col) {
		
		//check vertical row
		for (int i = 0; i < row; i++) {
			if(board[i][col]) { //if true means there is already queen, then return false that means u cant place queen
				return false;
			}
		}
		
		//check left diagonal
		int maxLeft = Math.min(row, col);
		for (int i = 1; i <= maxLeft; i++) {
			if(board[row - i][col - i]) { //if left diagonal is true, means there is queen then return false, because u cant place queen if there is another queen in diagonal also
				return false;
			}
		}
		
		//check right diagonal
		int maxRight = Math.min(row, board.length - col - 1);
		for (int i = 1; i <= maxRight ; i++) {
			if(board[row - i][col + i]) {
				return false;
			}
		}
		
		//if not any above cases then return true, means u can place queen there
		return true;
	}

	static void display(boolean[][] board) {

		for(boolean[] row : board) {
			for(boolean element : row) {
				if(element) { //if element is true then it means its Q so print it else print X
					System.out.print("Q ");
				}else {
					System.out.print("X ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n = 4;
		boolean[][] board = new boolean[n][n];
		System.out.println(nqueens(board, 0));
		
	}

}
