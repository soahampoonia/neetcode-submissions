class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curr = 0;
        int index = 0;
        int total = 0;
        for (int i = 0; i < gas.length; i++) {
            curr += gas[i];
            curr -= cost[i];
            if (curr < 0) {
                curr = 0;
                index = i + 1;
            }
            total += gas[i] - cost[i];
        }
        if (total < 0) return -1;
        return index;
    }
}
