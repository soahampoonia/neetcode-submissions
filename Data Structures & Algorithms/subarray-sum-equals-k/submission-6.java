class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // Base case: a running sum of 0 has appeared 1 time (empty prefix)
        map.put(0, 1);

        int curr = 0;
        int count = 0;

        for (int num : nums) {
            curr += num;

            // 1. Look back: how many past prefixes satisfy (curr - old = k)?
            if (map.containsKey(curr - k)) {
                count += map.get(curr - k);
            }

            // 2. Record current prefix for future indices to chop from
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }

        return count;
    }
}