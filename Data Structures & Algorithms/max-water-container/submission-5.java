class Solution {
    public int maxArea(int[] heights) {
        int curr = 0;
        int max = 0;

        int left = 0;
        int right = heights.length - 1;

        while (left < right) {
            curr = (right - left) * (Math.min(heights[left], heights[right]));
            if (curr > max) max = curr;

            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
