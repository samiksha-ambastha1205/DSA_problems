class Solution {

    public void solveSudoku(char[][] board) {
        solve(board);
    }

    public boolean solve(char[][] board) {

        // Find an empty cell
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                if (board[row][col] == '.') {

                    // Try every digit
                    for (char ch = '1'; ch <= '9'; ch++) {

                        if (isValid(board, row, col, ch)) {

                            // Choose
                            board[row][col] = ch;

                            // Explore
                            if (solve(board))
                                return true;

                            // Undo
                            board[row][col] = '.';
                        }
                    }

                    // No digit worked
                    return false;
                }
            }
        }

        // No empty cells left
        return true;
    }

    public boolean isValid(char[][] board, int row, int col, char ch) {

        // Check row
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == ch)
                return false;
        }

        // Check column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == ch)
                return false;
        }

        // Check 3x3 box
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == ch)
                    return false;
            }
        }

        return true;
    }
}