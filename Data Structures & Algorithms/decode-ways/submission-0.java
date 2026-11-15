class Solution {
    public int numDecodings(String s) {
        int[] dp = new int[s.length() + 1];

        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;

        int i = 2;

            while (i <= s.length()) {
                int num = (s.charAt(i-2) - '0') * 10
                        + (s.charAt(i-1) - '0');

                if (s.charAt(i-1) != '0') {
                    dp[i] += dp[i-1];
                }

                if (num >= 10 && num <= 26) {
                    dp[i] += dp[i-2];
                }

                i++;
            }
        return dp[dp.length - 1];
    }
}
