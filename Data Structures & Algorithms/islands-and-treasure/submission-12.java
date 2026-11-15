class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        Deque<int[]> qu = new ArrayDeque<>();

        // Phase 1: Collect all gates
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 0) {
                    qu.add(new int[]{i, j});
                }
            }
        }

        // Down, Up, Right, Left
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        // Phase 2: Multi-source BFS
        while (!qu.isEmpty()) {
            int[] arr = qu.poll();
            int x = arr[0];
            int y = arr[1];

            for (int[] dir : directions) {
                int nx = x + dir[0];
                int ny = y + dir[1];

                if (nx >= 0 && nx < rows && ny >= 0 && ny < cols && grid[nx][ny] == Integer.MAX_VALUE) {
                    grid[nx][ny] = grid[x][y] + 1;
                    qu.add(new int[]{nx, ny});
                }
            }
        }
    }
}