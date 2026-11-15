class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int leftmax = 0;
        int rightmax = 0;

        int sum = 0;

        while (left < right) {
            if (height[left] > leftmax) leftmax = height[left];
            
            if (height[right] > rightmax) rightmax = height[right];

            if (leftmax < rightmax) {
                sum += Math.min(leftmax,rightmax) - height[left];
                left++;
            }else {
                sum += Math.min(leftmax,rightmax) - height[right];
                right--;
            }           
        }
        return sum;
    }
}
