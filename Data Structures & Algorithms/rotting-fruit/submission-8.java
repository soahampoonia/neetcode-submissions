class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        Deque<int[]> qu = new ArrayDeque<>();

        int fresh = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    qu.add(new int[]{i, j});
                }
                if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        if (fresh == 0) {
            return 0;
        }
        
        int[][] d = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int minutes = 0;

        

        while (!qu.isEmpty() && fresh > 0) {
            
            int size = qu.size();

            for (int w = 0; w < size; w++) {
                
                int[] arr = qu.poll();
            
                int x = arr[0];
                int y = arr[1];

                for (int[] dir : d) {
                    int nx = x + dir[0];
                    int ny = y + dir[1];

                    if (nx < rows && nx >= 0 && ny >= 0 && ny < cols && grid[nx][ny] == 1) {
                        grid[nx][ny] = 2;
                        fresh--;
                        qu.add(new int[]{nx, ny});
                    }
                
                }
                
            }
            minutes++;
        }

        return fresh == 0 ? minutes : -1;
    }
}
