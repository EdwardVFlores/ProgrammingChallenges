class Solution {
    public void solve(char[][] board) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        //Change O's connected to border to equal true
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(i == 0 || i == board.length - 1 || j == 0 || j == board[0].length - 1 ) {
                    if(board[i][j] == 'O') {
                        dfs(i, j, board, visited, true);
                    }
                }
            }
        }
        //Now only visit the middle part and swap the non visited O's
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 'O' && !visited[i][j]) {
                    dfs(i, j, board, visited, false);
                }
            }
        }
    }
    void dfs(int row, int col, char[][] board, boolean[][] visited, boolean isBorder) {
        if(row >= 0 && row < board.length && col >= 0 && col < board[0].length 
           && board[row][col] == 'O' && !visited[row][col]) {
           visited[row][col] = true;
            if(!isBorder) board[row][col] = 'X';
            dfs(row,col+1,board,visited, isBorder);
            dfs(row,col-1,board,visited, isBorder);
            dfs(row-1,col,board,visited, isBorder);
            dfs(row+1,col,board,visited, isBorder);
        }
    }
}
