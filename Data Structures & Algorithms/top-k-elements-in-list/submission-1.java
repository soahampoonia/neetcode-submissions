class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        List<Integer>[] buckets = new ArrayList[nums.length+1];

        for (int key : map.keySet()) {
            int frequency = map.get(key);
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            } 
                buckets[frequency].add(key);

        }
        int[] result = new int[k];
        int tally = 0;

        for (int i = buckets.length -1; i > 0 && tally < k; i--) {
            if (buckets[i] != null) {
                for (int val : buckets[i]) { 
                    result[tally] = val;
                    tally++;
                    if (tally == k) {
                        return result;
                    }
                }
            }
            
        }

        return result;
    }
}
