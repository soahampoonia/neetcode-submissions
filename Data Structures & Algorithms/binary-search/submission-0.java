class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            // Calculate mid at the top of the loop
            int mid = left + (right - left) / 2;

            // Did we find it? (Comparing the VALUE, not the index)
            if (nums[mid] == target) {
                return mid;
            } 
            // The value is too big, move the right boundary past mid
            else if (nums[mid] > target) {
                right = mid - 1;
            } 
            // The value is too small, move the left boundary past mid
            else {
                left = mid + 1;
            }
        }
        
        return -1;
    }
}