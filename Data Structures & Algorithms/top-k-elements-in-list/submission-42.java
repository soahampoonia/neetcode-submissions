class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue();

            buckets[val].add(key);
        }

        int[] sol = new int[k];
        int z = 0;

        for (int i = buckets.length - 1; i >= 0; i--) {
            for (int m = 0; m < buckets[i].size(); m++) {
                sol[z] = buckets[i].get(m);
                z++;

                if (z == k) {
                    return sol;
                }
            }
        }
        return sol;
    }
}
