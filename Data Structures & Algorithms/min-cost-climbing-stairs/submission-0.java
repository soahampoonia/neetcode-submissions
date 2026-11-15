class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];

        dp[0] = cost[0];
        dp[1] = cost[1];
        int i = 2;

        while (i < cost.length) {
            dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);
            i++;
        }

        return Math.min(dp[dp.length - 1], dp[dp.length - 2]);
    }
}
