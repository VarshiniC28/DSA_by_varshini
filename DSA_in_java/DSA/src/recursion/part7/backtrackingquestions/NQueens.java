package recursion.part7.backtrackingquestions;

public class NQueens {

	
//	Given n, nxn board, place n queens on it. So that each queen cant attack other. i.e Q should not be in the same row , column and diagonal of other Q
//	How many possible ways can we do this and total number of ways?
	
	//This is recursion and backtracking
	
	static int nqueens(boolean[][] board, int row) {
		if(row == board.length) {
			display(board, row);
		}
		
		int count = 0;
		
		return count;
	}
	
	static void display(boolean[][] board, int row) {

		for(boolean[] arr : board) {
			if(arr[row] == true) {
				System.out.println("Q ");
			}else {
				System.out.println("X ");
			}
		}
	}

	public static void main(String[] args) {
		
	}

}
