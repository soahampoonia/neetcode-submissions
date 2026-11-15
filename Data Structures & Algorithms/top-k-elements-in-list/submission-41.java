class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();
            buckets[freq].add(num);
        }

        int[] arr = new int[k];

        int x = 0;

        for (int i = buckets.length - 1; i >= 0; i--) {
            for (int num : buckets[i]) {
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
