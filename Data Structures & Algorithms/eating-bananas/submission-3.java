class Solution {
    public int minEatingSpeed(int[] piles, int h) {
    int lo = 1, hi = 0;
    for (int p : piles) hi = Math.max(hi, p);
    int best = hi;

    while (lo <= hi) {
        int mid = lo + (hi - lo) / 2;
        if (canFinish(piles, mid, h)) {
            best = mid;
            hi = mid - 1;
        } else {
            lo = mid + 1;
        }
    }
    return best;
}
    boolean canFinish(int[] piles, int k, int h) {
        long hours = 0;
        for (int p : piles) hours += (p + k - 1) / k;   // ceiling division
        return hours <= h;
    }
}
