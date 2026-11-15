class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int max = 0;

        for (int p : piles) {
            if (p > max) max = p;
        }

        int right = max;

        int smallest = Integer.MAX_VALUE;

        while (left <= right) {
            long sum = 0;
            int mid = (right - left) /2 + left;

            for (int i = 0; i < piles.length; i++) {
                sum += Math.ceil((double) piles[i] / mid);            
            }
            
            

            if (sum <= h) {
                if (mid < smallest) smallest = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return smallest;
    }
}
