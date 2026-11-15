class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            if (freq > nums.length/2) {
                return num;
            }
        }
        return -1;

    }
}