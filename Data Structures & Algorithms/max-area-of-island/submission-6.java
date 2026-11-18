class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int size = 0;
        int  max = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    size = dfs(grid, i, j);
                    max = Math.max(size, max);
                }
            }
        }
        return max;
    }


    public int dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 2 || grid[i][j] == 0) {
            return 0;
        }

        grid[i][j] = 2;
        int count = 1;

        int down = dfs(grid, i-1, j);
        int up = dfs(grid, i+1, j);
        int right = dfs(grid, i, j+1);
        int left = dfs(grid, i, j-1);

        return up + left + down + right + 1;

    }
}
