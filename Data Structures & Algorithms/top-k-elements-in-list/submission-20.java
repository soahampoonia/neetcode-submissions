class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for (int j = 0; j < buckets.length; j++) {
            buckets[j] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int freq = entry.getValue();

            buckets[freq].add(key);
        }

        int[] arr = new int[k];

        int x = 0;

        for (int m = buckets.length - 1; m >= 0; m--) {
            for (int num : buckets[m]) {
                    arr[x] = num;
                    x++;
                    if (x == k) {
                        return arr;
                }
            } 
        }
        return arr;
    }
}
