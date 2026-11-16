class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int max = 0;

        for (int i : piles) {
            max = Math.max(i, max);
        }

        int left = 1;
        int right = max;

        while (left < right) {
            int mid = (right - left)/2 + left;

            if (koko(piles, h, mid) == true) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
        
    }


    public boolean koko(int[] piles, int h, int y) {
        
        long time = 0;

        for (int i = 0; i < piles.length; i++) {
            int x = piles[i];
                time += (x + y - 1) / y;
            if (time > h) return false;
        }
        return true;
    } 
}
