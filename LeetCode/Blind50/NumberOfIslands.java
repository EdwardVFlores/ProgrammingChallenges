class Solution {
    public int numIslands(char[][] grid) {
        int countIslands = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1') {
                    checkIslands(i,j,grid);
                    countIslands++;
                }
            }
        }
        return countIslands;
    }
    
    public void checkIslands(int i, int j, char[][] grid){
        if(i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == '1') {
            grid[i][j] = '0'; 
            checkIslands(i+1,j,grid);
            checkIslands(i-1,j,grid);
            checkIslands(i,j+1,grid);
            checkIslands(i,j-1,grid);
        }
    }
}