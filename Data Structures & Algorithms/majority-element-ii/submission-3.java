class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int req = nums.length/3;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int val = entry.getKey();
            int freq = entry.getValue();

            if (freq > req) {
                list.add(val);
            }
        }
        return list;
    }
}