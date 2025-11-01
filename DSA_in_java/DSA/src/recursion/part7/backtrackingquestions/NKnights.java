package recursion.part7.backtrackingquestions;

public class NKnights {
	
	static void knights(boolean[][] board, int r, int c, int knights) {
		if(knights == 0) {
			display(board);
			System.out.println();
			return;
		}
		
		//if row and col is out of bound then also skip
		if(r == board.length - 1 && c == board.length) {
			return;
		}
		
		//if col is board.length(last cell in that row) then go to next row
		if(c == board.length) {
			knights(board, r+1, 0, knights);
			return;
		}
		
		if(isSafe(board, r, c)) {
			board[r][c] = true;
			knights(board, r, c+1, knights - 1);
			board[r][c] = false;
		}
		
		//not safe then also move to next col without reducing no of knights
		knights(board, r, c+1, knights);
	}
	
	static boolean isSafe(boolean[][] board, int r, int c) {
		if(isValid(board, r - 2, c + 1)) {
			if(board[r - 2][c + 1]) {
				return false;
			}
		}
		
		if(isValid(board, r - 2, c - 1)) {
			if(board[r - 2][c - 1]) {
				return false;
			}
		}
		
		if(isValid(board, r - 1, c + 2)) {
			if(board[r - 1][c + 2]) {
				return false;
			}
		}
		
		if(isValid(board, r - 1, c - 2)) {
			if(board[r - 1][c - 2]) {
				return false;
			}
		}
		
		return true;
	}
	

	static boolean isValid(boolean[][] board, int r, int c) {
		
		if(r >= 0 && r < board.length && c >= 0  && c < board.length) {
			return true;
		}
		return false;
	}

	static void display(boolean[][] board) {
		for(boolean[] arr: board) {
			for(boolean element : arr) {
				if(element) {
					System.out.print("K ");
				}else {
					System.out.print("x ");
				}
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {

		int n = 4;
		boolean[][] board = new boolean[n][n];
		knights(board, 0 , 0 , n);
	}

}
