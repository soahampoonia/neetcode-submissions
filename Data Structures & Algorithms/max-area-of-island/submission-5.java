class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int max = 0;
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    int curr = dfs(grid, i, j);
                    if (curr > max) max = curr;
                } 
            }
        }
        return max;
    }


    public int dfs(int[][] matrix, int r, int c) {

        if (r < 0 || r >= matrix.length || c < 0 || c >= matrix[0].length || matrix[r][c] == 0) {
            return 0;
        }

        matrix[r][c] = 0;

        return 1 + dfs(matrix, r+1, c) + dfs(matrix, r-1, c) + dfs(matrix, r, c-1) + dfs(matrix, r, c+1);

    }
}
