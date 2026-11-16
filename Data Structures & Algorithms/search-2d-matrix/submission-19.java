class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int lastCol = matrix[0].length - 1;

        int top = 0;
        int bottom = rows - 1;
        int targetRow = -1;

        // 1. Binary search to find the correct row
        while (top <= bottom) {
            int mid = (bottom - top) / 2 + top;

            if (target >= matrix[mid][0] && target <= matrix[mid][lastCol]) {
                targetRow = mid;
                break;
            } else if (target < matrix[mid][0]) {
                bottom = mid - 1; // Target is in an earlier row
            } else {
                top = mid + 1;    // Target is in a later row
            }
        }

        // If no row can contain the target, return false early
        if (targetRow == -1) return false;

        // 2. Binary search within targetRow
        int left = 0;
        int right = lastCol;

        while (left <= right) {
            int mid = (right - left) / 2 + left;

            if (matrix[targetRow][mid] == target) return true;

            if (matrix[targetRow][mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}