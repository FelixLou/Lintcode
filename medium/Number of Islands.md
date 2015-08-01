Question: http://www.lintcode.com/en/problem/number-of-islands/

   private void removeIsland(boolean[][] grid, int i, int j){
        int rows = grid.length;
        int cols = grid[0].length;
        grid[i][j] = false; 
        if (i < rows - 1 && grid[i + 1][j]){
            //grid[i + 1][j] = false;
            removeIsland(grid, i + 1, j);
        }
        if (i > 0 && grid[i - 1][j]){
            //grid[i + 1][j] = false;
            removeIsland(grid, i - 1, j);
        }
        if (j < cols -1 && grid[i][j + 1]){
            //grid[i][j + 1] = false;
            removeIsland(grid, i, j + 1);
        }
        if (j > 0 && grid[i][j - 1]){
            //grid[i][j + 1] = false;
            removeIsland(grid, i, j - 1);
        }
    }
    public int numIslands(boolean[][] grid) {
        // Write your code here
        if (grid == null){
            return 0;
        }
        int rows = grid.length;
        if (rows == 0){
            return 0;
        }
        int cols = grid[0].length;
        if (cols == 0){
            return 0;
        }
        int result = 0;
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                if (grid[i][j]){
                    removeIsland(grid, i, j);
                    result++;
                }
            }
        }
        return result;
    }
