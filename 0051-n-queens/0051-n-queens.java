class Solution {

    public List<List<String>> solveNQueens(int n) {

        List<List<String>> result = new ArrayList<>();

        char[][] board = new char[n][n];

        // Fill board with '.'
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                board[i][j] = '.';
            }
        }

        backtrack(board, 0, result);

        return result;
    }

    public void backtrack(char[][] board, int row,
                          List<List<String>> result)
    {
        // All queens placed
        if(row == board.length)
        {
            List<String> solution = new ArrayList<>();

            for(int i = 0; i < board.length; i++)
            {
                solution.add(new String(board[i]));
            }

            result.add(solution);
            return;
        }

        // Try every column in this row
        for(int col = 0; col < board.length; col++)
        {
            if(isSafe(board, row, col))
            {
                // Choose
                board[row][col] = 'Q';

                // Go to next row
                backtrack(board, row + 1, result);

                // Undo
                board[row][col] = '.';
            }
        }
    }

    public boolean isSafe(char[][] board, int row, int col)
    {
        // Check column
        for(int i = 0; i < row; i++)
        {
            if(board[i][col] == 'Q')
                return false;
        }

        // Check upper-left diagonal
        int i = row - 1;
        int j = col - 1;

        while(i >= 0 && j >= 0)
        {
            if(board[i][j] == 'Q')
                return false;

            i--;
            j--;
        }

        // Check upper-right diagonal
        i = row - 1;
        j = col + 1;

        while(i >= 0 && j < board.length)
        {
            if(board[i][j] == 'Q')
                return false;

            i--;
            j++;
        }

        return true;
    }
}