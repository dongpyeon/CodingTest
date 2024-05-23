class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board.length; j++)
            {
                if(board[i][j]==1)
                    boom(board,i,j);
            }
        }
        
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board.length; j++)
            {
                if(board[i][j]==0)
                    answer++;
            }
        }
        
        
        return answer;
    }
    
    public void boom(int[][] board,int x, int y){
        for(int i=-1; i<2; i++)
        {
            for(int j=-1; j<2; j++)
            {
                if(x+i>=0 && x+i<board.length && y+j>=0 && y+j<board.length)
                {
                    board[x+i][y+j]= board[x+i][y+j]==1 ? 1 : 2;
                }
            }
        }  
    }
}