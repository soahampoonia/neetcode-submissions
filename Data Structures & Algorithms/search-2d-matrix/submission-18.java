class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int row = 0;

        int top = 0;
        int bottom = rows - 1;
        while (top <= bottom) {
            int mid = (bottom - top) / 2 + top;
            if (matrix[mid][0] <= target && matrix[mid][cols - 1] >= target) {
                row = mid;
                break;
            }
            if (matrix[mid][0] < target) {
                top = mid + 1;
            }
            if (matrix[mid][0] > target) {
                bottom = mid - 1;
            }
        }


        int left = 0;
        int right = matrix[row].length - 1;

        while (left <= right) {
            int mid = (right - left) / 2 + left;

            if (matrix[row][mid] == target) {
                return true;
            }
            
            if (matrix[row][mid] > target) {
                right = mid - 1;
            } else if (matrix[row][mid] < target) {
                left = mid + 1;
            }
        }

        return false;
    }
}
