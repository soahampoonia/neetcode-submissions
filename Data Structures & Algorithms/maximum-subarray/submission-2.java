class Solution {
    public int maxSubArray(int[] nums) {
        int left = 0;
        int right = 0;

        int max = Integer.MIN_VALUE;
        int cur = 0;

        while (right < nums.length) {

            if (cur < 0) {
                left = right;
                cur = 0;
            }
            cur += nums[right];

            if (cur > max) max = cur;
            right++;

        }
        return max;
    }
}
