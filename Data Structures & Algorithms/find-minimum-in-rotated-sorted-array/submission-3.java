class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        int min = Integer.MAX_VALUE;

        while (left <= right) {
            int mid = (right - left)/2 + left;

            min = Math.min(nums[mid], min);
            
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return min;
    }
}
