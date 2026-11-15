class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Create tracking arrays for the 9 rows, 9 cols, and 9 boxes. 
        // The second dimension of size 9 represents the digits 1-9.
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];
        
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                // Skip empty cells
                if (board[r][c] == '.') {
                    continue;
                }
                
                // Convert the char '1'-'9' to a zero-based index 0-8
                // For example: '5' - '1' = 4. 
                int value = board[r][c] - '1'; 
                
                // Calculate which of the 9 boxes we are currently standing in
                int boxIndex = (r / 3) * 3 + (c / 3);
                
                // If this value is already marked true in its row, col, or box, the board is invalid
                if (rows[r][value] || cols[c][value] || boxes[boxIndex][value]) {
                    return false;
                }
                
                // Otherwise, mark this value as seen for future checks
                rows[r][value] = true;
                cols[c][value] = true;
                boxes[boxIndex][value] = true;
            }
        }
        
        return true; // If we finish the loop without conflicts, it's valid
    }
}