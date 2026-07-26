class Solution {
    public boolean exist(char[][] board, String word) 
    {
        int m = board.length;
        int n = board[0].length;

        for(int i =0;i<m;i++)
        {
            for(int j =0;j<n;j++)
            {
                if(backtrack(board,word, i , j , 0))
                return true;
            }

        }
        return false;
    }
    public boolean backtrack(char[][] board, String word, int row , int col,int index)
    {
      //we found the word
      if(index==word.length())
      {
        return true;
      }
      //we will start and check all directions 
      if(row<0||col>=board[0].length||row>=board.length||col<0)
      {
        return false;
      }
      //wrong character
      if(board[row][col]!=word.charAt(index))
      return false;
      //mark as visited
      char temp = board[row][col];
      board[row][col]='#';

      boolean found = backtrack(board,word,row-1,col,index+1)||backtrack(board,word,row+1,col,index+1)||backtrack(board,word,row,col+1,index+1)||backtrack(board,word,row,col-1,index+1);

      //undo
      board[row][col]=temp;
      return found;

    }
}