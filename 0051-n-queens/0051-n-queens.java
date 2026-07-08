import java.util.*;

class Solution {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();

        boolean[] cols = new boolean[n];
        boolean[] diag1 = new boolean[2 * n]; 
        boolean[] diag2 = new boolean[2 * n];

        char[][] board = new char[n][n];

        for (char[] row : board) {
            Arrays.fill(row, '.');
        }

        backtrack(0, n, board, cols, diag1, diag2, result);

        return result;
    }

    private void backtrack(int row, int n,
                           char[][] board,
                           boolean[] cols,
                           boolean[] diag1,
                           boolean[] diag2,
                           List<List<String>> result) {

        // base case: all rows filled
        if (row == n) {
            result.add(construct(board));
            return;
        }

        for (int col = 0; col < n; col++) {

            int d1 = row - col + n;
            int d2 = row + col;

            // check if safe
            if (cols[col] || diag1[d1] || diag2[d2]) continue;

            // place queen
            board[row][col] = 'Q';
            cols[col] = true;
            diag1[d1] = true;
            diag2[d2] = true;

            // explore
            backtrack(row + 1, n, board, cols, diag1, diag2, result);

            // undo (backtrack)
            board[row][col] = '.';
            cols[col] = false;
            diag1[d1] = false;
            diag2[d2] = false;
        }
    }

    private List<String> construct(char[][] board) {
        List<String> res = new ArrayList<>();
        for (char[] row : board) {
            res.add(new String(row));
        }
        return res;
    }
}