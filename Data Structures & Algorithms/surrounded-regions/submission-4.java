class Solution {
    public void solve(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < cols; i++) {
            if (board[0][i] == 'O') {
                dfs(board, 0, i);
            }
        }
        
        for (int j = 0; j < rows; j++) {
            if (board[j][0] == 'O') {
                dfs(board, j, 0);
            }
        }
        
        for (int k = 0; k < cols; k++) {
            if (board[rows - 1][k] == 'O') {
                dfs(board, rows-1, k);
            }
        }
        
        for (int l = 0; l < rows; l++) {
            if (board[l][cols - 1] == 'O') {
                dfs(board, l, cols-1);
            }
        }


        for (int z = 0; z < rows; z++) {
            for (int y = 0; y < cols; y++) {
                if (board[z][y] == 'O') {
                    board[z][y] = 'X';
                }
                if (board[z][y] == 'T') {
                    board[z][y] = 'O';
                }
            }
        }
    }


    public void dfs(char[][] board, int x, int y) {
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length || board[x][y] != 'O') {
            return;
        }
        board[x][y] = 'T';

        dfs(board, x+1, y);
        dfs(board, x-1, y);
        dfs(board, x, y+1);
        dfs(board, x, y-1);
    }
}
