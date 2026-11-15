class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] arr = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int curr = target - nums[i];
            
            if (map.containsKey(curr)) {
                arr[1] = i;
                arr[0] = map.get(curr);
            }
            map.put(nums[i], i);
        }
        return arr;
    }
}
