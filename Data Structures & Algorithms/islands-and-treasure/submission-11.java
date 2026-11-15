class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        Deque<int[]> qu = new ArrayDeque<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 0) {
                    qu.add(new int[]{i, j});
                }
            }
        }

        while (!qu.isEmpty()) {
            int[] arr = qu.poll();
            int x = arr[0];
            int y = arr[1];

            if (x + 1 < rows && grid[x + 1][y] == Integer.MAX_VALUE) {
                grid[x+1][y] = grid[x][y] + 1;
                qu.add(new int[]{x+1, y});
            }
            if (x - 1 >= 0 && grid[x - 1][y] == Integer.MAX_VALUE) {
                grid[x-1][y] = grid[x][y] + 1;
                qu.add(new int[]{x-1, y});
            }
            if (y + 1 < cols && grid[x][y+1] == Integer.MAX_VALUE) {
                grid[x][y+1] = grid[x][y] + 1;
                qu.add(new int[]{x, y+1});
            }
            if (y - 1 >= 0 && grid[x][y - 1] == Integer.MAX_VALUE) {
                grid[x][y-1] = grid[x][y] + 1;
                qu.add(new int[]{x, y-1});
            }

            
        }

    }
}
