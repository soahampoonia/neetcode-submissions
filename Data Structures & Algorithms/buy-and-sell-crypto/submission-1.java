class Solution {
    public int maxProfit(int[] prices) {
        int min = 9999999;

        int profit = 0;

        for (int price : prices) {
            if (price < min) {
                min = price;
            }

        if (price - min > profit) {
            profit = price - min;
        }

        }
        return profit;
    }
}
