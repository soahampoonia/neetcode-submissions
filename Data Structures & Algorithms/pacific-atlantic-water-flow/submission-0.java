class Solution {
    
    
    
    
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;

        boolean[][] pac = new boolean[rows][cols];
        boolean[][] atl = new boolean[rows][cols];
        
        for (int i = 0; i < cols; i++) {
            dfs(heights, 0, i, pac);
        }
        for (int j = 0; j < rows; j++) {
            dfs(heights, j, 0, pac);
        }
        for (int k = 0; k < cols; k++) {
            dfs(heights, rows - 1, k, atl);
        }
        for (int l = 0; l < rows; l++) {
            dfs(heights, l, cols - 1, atl);
        }
        List<List<Integer>> list = new ArrayList<>();

        for (int q = 0; q < rows; q++) {
            for (int w = 0; w < cols; w++) {
                if (pac[q][w] == true && atl[q][w] == true) {
                    list.add(List.of(q, w));
                }
            }
        }

        return list;
    }

    public void dfs(int[][] graph, int r, int c, boolean[][] mappy) {
        if (r < 0 || r >= graph.length || c < 0 || c >= graph[0].length || mappy[r][c]) {
            return;
        }

        mappy[r][c] = true;

        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
            for (int[] d : dirs) {
                int nr = r + d[0];
                int nc = c + d[1];
                if (nr >= 0 && nr < graph.length && nc >= 0 && nc < graph[0].length) {
                    if (!mappy[nr][nc] && graph[nr][nc] >= graph[r][c]) {
                        dfs(graph, nr, nc, mappy);
                    }
                }
            }

    }
}
