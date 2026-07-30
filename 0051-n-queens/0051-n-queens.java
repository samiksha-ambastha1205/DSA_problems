class Solution {
    public List<List<String>> solveNQueens(int n) 
    {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i =0;i<n;i++)
        {
            for(int j =0;j<n;j++)
            {
                board[i][j]='.';
            }
        }
        backtrack(board,0,result);
        return result;
        
    }
    public void backtrack(char[][] board,int start, List<List<String>> result)
    {
        if(start==board.length)
        {
            List<String> solution = new ArrayList<>();
            for(char[] r: board)
            {
                solution.add(new String(r));
            }
            result.add(solution);
            return;
        }
        for(int i =0;i<board.length;i++)
        {
         if(isSafe(board,start,i))
         {
            board[start][i]='Q';
            backtrack(board,start+1,result);
            board[start][i]='.';
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

    // Upper-left diagonal
    for(int i = row - 1, j = col - 1;
        i >= 0 && j >= 0;
        i--, j--)
    {
        if(board[i][j] == 'Q')
            return false;
    }

    // Upper-right diagonal
    for(int i = row - 1, j = col + 1;
        i >= 0 && j < board.length;
        i--, j++)
    {
        if(board[i][j] == 'Q')
            return false;
    }

    return true;
}
}