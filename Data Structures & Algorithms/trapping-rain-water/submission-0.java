class Solution {
    public int trap(int[] height) {
        // Edge case: empty arrays can't trap water
        if (height == null || height.length == 0) {
            return 0;
        }

        int left = 0;
        int right = height.length - 1;
        
        // Initialize the maxes with the actual first blocks
        int leftMax = height[left];
        int rightMax = height[right];
        
        int total = 0;

        while (left < right) {
            
            // Bottlenecked by the left side
            if (leftMax < rightMax) {
                left++; // Move inward first
                
                // Update the max if it's a new peak, otherwise add water
                if (height[left] > leftMax) {
                    leftMax = height[left];
                } else {
                    total += leftMax - height[left];
                }
            } 
            // Bottlenecked by the right side
            else {
                right--; // Move inward first
                
                // Update the max if it's a new peak, otherwise add water
                if (height[right] > rightMax) {
                    rightMax = height[right];
                } else {
                    total += rightMax - height[right];
                }
            }
        }
        
        return total;
    }
}