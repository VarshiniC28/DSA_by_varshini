package recursion.part7.backtrackingquestions;

public class SudokuSolver {
	
	static boolean solve(int[][] board) {
	    int size = board.length;

	    int row = -1;
	    int col = -1;
	    boolean hasEmptyCell = false;

	    //Step 1: Find the next empty cell (value == 0)
	    for (int i = 0; i < size; i++) {
	        for (int j = 0; j < size; j++) {
	            if (board[i][j] == 0) {
	                row = i;
	                col = j;
	                hasEmptyCell = true;
	                break;  // found one empty cell, stop inner loop
	            }
	        }
	        if (hasEmptyCell) {
	            break;  // stop outer loop too
	        }
	    }

	    //Step 2: Base case – no empty cell found → Sudoku solved
	    if (!hasEmptyCell) {
	        return true;
	    }

	    //Step 3: Try filling digits 1–9 in this empty cell
	    for (int num = 1; num <= 9; num++) {
	        if (isSafe(board, row, col, num)) {

	            // Place the number temporarily
	            board[row][col] = num;

	            // Recursively attempt to solve the rest of the board
	            if (solve(board)) {
	                return true; // solved downstream
	            }

	            // ❌ Backtrack: undo the placement and try next number
	            board[row][col] = 0;
	        }
	    }

	    // No number (1–9) worked → need to backtrack further
	    return false;
	}

	
	static boolean isSafe(int[][] board, int row, int col, int num) {
		
		//checking the row if num is already present
		for(int i = 0; i < board.length; i++) {
			if(board[row][i] == num) {
				return false;
			}
		}
		
		//checking the col to see if num is already present
		for(int j=0; j < board.length; j++) {
			if(board[j][col] == num) {
				return false;
			}
		}
		
		//checking if there is num in that 3x3 grid
		int sqrt = (int)Math.sqrt(board.length); //this is to know the size of sub grid- i.e if 9x9 grid then it will 3x3 size for sub grid
		int rowStart = row - (row % sqrt);
		int colStart = col - (col % sqrt);
		
		for(int r = rowStart; r < rowStart + sqrt; r++) {
			for (int c = colStart; c < colStart + sqrt; c++) {
				if(board[r][c] == num) {
					return false;
				}
			}
		}
		
		//couldn't find that num anywhere then it's safe so return true
		return true;
	}
	
	static void display(int[][] board) {
		for(int[] row : board) {
			for(int num : row){
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {

		  int[][] board = {
		            {5, 3, 0, 0, 7, 0, 0, 0, 0},
		            {6, 0, 0, 1, 9, 5, 0, 0, 0},
		            {0, 9, 8, 0, 0, 0, 0, 6, 0},
		            {8, 0, 0, 0, 6, 0, 0, 0, 3},
		            {4, 0, 0, 8, 0, 3, 0, 0, 1},
		            {7, 0, 0, 0, 2, 0, 0, 0, 6},
		            {0, 6, 0, 0, 0, 0, 2, 8, 0},
		            {0, 0, 0, 4, 1, 9, 0, 0, 5},
		            {0, 0, 0, 0, 8, 0, 0, 7, 9}
		        };
		  
		  if(solve(board)) {
			  display(board);
		  }
	}

}
