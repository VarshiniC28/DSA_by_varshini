package recursion.part7.backtrackingquestions;

public class SudokuSolver2 {

    static boolean solve(char[][] board) {
        int size = board.length;

        int row = -1;
        int col = -1;
        boolean hasEmptyCell = false;

        // Step 1: Find next empty cell (marked as '.')
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == '.') {
                    row = i;
                    col = j;
                    hasEmptyCell = true;
                    break;
                }
            }
            if (hasEmptyCell) break;
        }

        // Step 2: Base case – no empty cell → solved
        if (!hasEmptyCell) {
            return true;
        }

        // Step 3: Try placing digits '1'–'9'
        for (char num = '1'; num <= '9'; num++) {
            if (isSafe(board, row, col, num)) {
                // Place number
                board[row][col] = num;

                // Recursive call
                if (solve(board)) {
                    return true;
                }

                // ❌ Backtrack
                board[row][col] = '.';
            }
        }

        // No valid number → backtrack
        return false;
    }

    static boolean isSafe(char[][] board, int row, int col, char num) {
        // Check row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        // Check column
        for (int j = 0; j < board.length; j++) {
            if (board[j][col] == num) {
                return false;
            }
        }
        

        // Check 3×3 subgrid
        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row - (row % sqrt);
        int colStart = col - (col % sqrt);

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    static void display(char[][] board) {
        for (char[] row : board) {
            for (char num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        if (solve(board)) {
            display(board);
        } else {
            System.out.println("No solution exists");
        }
    }
}
