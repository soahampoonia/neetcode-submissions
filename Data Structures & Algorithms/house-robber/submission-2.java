class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];

        int i = 2;

        if (nums.length == 1) return nums[0];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[1], dp[0]);

        while (i < nums.length) {
            dp[i] = Math.max(nums[i] + dp[i-2], dp[i-1]);
            i++;
        }

        return dp[nums.length - 1];
    }
}
