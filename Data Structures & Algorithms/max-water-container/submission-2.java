class Solution {
    public int maxArea(int[] heights) {
        
        int right = heights.length - 1;
        
        int left = 0;

        int max = Integer.MIN_VALUE;

        while (left < right) {
            
            int volume = Math.min(heights[left], heights[right]) * (right - left);
            
            if (volume > max) {
                max = volume;
            }

            if (heights[left] < heights[right]) {
                left++;
                
            } else {
                right--;
                
            }
        }
        return max;
    }
}
