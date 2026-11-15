class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    public void dfs(char[][] graph, int r, int c) {
        if (r < 0 || r >= graph.length || c < 0 || c >= graph[0].length || graph[r][c] == '0') {
            return;
        }

         graph[r][c] = '0';

        dfs(graph, r + 1, c);
        dfs(graph, r - 1, c);
        dfs(graph, r, c + 1);
        dfs(graph, r, c - 1);
    }
}